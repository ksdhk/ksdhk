package solution;


import java.util.Scanner;

public class Bakjun_1018{
	static char trans[][]; // 8x8의 체스판을 뜯어 내 저장하는 체스판 변수이다.
	static char arr[][];  // nxm의 보드를 저장 할 변수이다.
	static final char[][] white = { // (0,0)이 W일 때 가질 수 있는 규칙이다.
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'}
	};
	
	static final char[][] black = { // (0,0)이 B일 때 가질 수 있는 규칙이다.
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'}
	};
	public static int trans(int a, int b,int min) { // 뜯어낸 체스판을 각 규칙과 비교하는 메소드
		int cnt_b =0; // BLACK 규칙과 비교하여 발생하는 변환횟수 저장 변수
		int cnt_w =0; // WHITE "
		int k=0;
		StringBuilder builder = new StringBuilder("");
		for(int i =a;i<a+8;i++) { // 시작점이 전달되면 그로부터 8칸을 보드에서 가져온다
			builder.setLength(0); //StringBuilder 초기화 , 공백으로 만든다.

			for(int j=b;j<b+8;j++) { // 시작점이 전달되면 그로부터 8칸을 보드에서 가져온다
				builder.append(arr[i][j]); // 보드에서 가져온 해당 점을 stringbuilder에 저장
				
			}		
			for(int j=0;j<builder.length();j++) {
				trans[k][j] = builder.charAt(j); //행 단위로 체스판 배열에 저장
			}
			k++; // 체스판 행 증가, 
			
		}
				
		for(int i=0;i<trans.length;i++) { // 체스판을 탐색
			for(int j=0;j<trans[i].length;j++) {									
						if(trans[i][j]!=black[i][j]) { // black의 규칙으로 변환되는 횟수
							cnt_b++;
						}		
						if(trans[i][j]!=white[i][j]) { // white의 규칙으로 변환되는 횟수
							cnt_w++;
						}			
				}			
				
			}
		
		
		
		return Math.min(Math.min(cnt_w, cnt_b), min); // min값은 다른 체스판에서 발생한 최솟값
        											  // 첫 번째 인자는 현재 체스판에서 black과 white의 변환횟수 중 최솟값
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new char [n][m];
		
		trans = new char [8][8]; 
		for(int i=0;i<n;i++) { // 행 단위로 입력
			String row = sc.next();
			
			for(int j=0;j<m;j++) {
				arr[i][j] = row.charAt(j);
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<=n-8;i++) {// (0,0) ~ (n-8, m-8)의 범위만큼 시작점을 전달
			for(int j=0;j<=m-8;j++) {
				min =trans(i,j,min); // 위의 메소드로 시작점과 현재까지 만든 체스판 중 최솟값 전달
				
			}
			
		}
		System.out.println(min);//output
		
	}
	
}