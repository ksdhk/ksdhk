package solution;

import java.util.Scanner;

	public class Bakjun_14889 {
		static int n; // 사람 수 입력 변수
		static int map[][],check[]; // 능력치 판 2차원 배열, 각 사람 수의 방문 배열
		static int  min = Integer.MAX_VALUE; // 최솟값을 찾기 위한 변수
		
		
	    //DFS메소드, 조합의 개념을 사용하므로 별도의 시작 부분을 전달해 주어야 한다.
		static void dfs(int start,int cnt) { 
			
			if(cnt == n/2) { // DFS 종료 부, n/2의 사람 수만큼 선택하면 계산을 시작한다.
				cal(); // 최솟값을 계산하는 메소드
				
				return;
			}
			
	        // 전달받은 start+1 부터 반복해야 중복을 배제할 수 있다.
	        // 예를 들어, 1번 2번 3번 사람을 선택했을 때 계산을 완료 후
	        // 2번 사람이 첫 번째 일 때 3번 사람부터 탐색하는 것이다.
	        // 자연스레 1번 사람은 배제가 된다.
			for(int i=start+1;i<n;i++) {
				if(check[i]==0) { // 방문하지 않은 사람이면
					check[i]=1; // 방문 처리 후
					dfs(i,cnt+1); // 재귀 호출, 시작 값과 선택된 사람의 수를 넘겨준다.
					check[i]=0; // 백 트래킹
				}
			}
			
			
		}
		
		static void cal() { // n/2 수의 사람을 선택 후 계산하는 메소드
			int start =0,link =0; // start팀과 link팀의 능력치가 저장되는 변수
			int a[] = new int[n/2]; // 선택된 사람들과 선택되지 않은 사람들이 저장 될 배열들
			int b[] = new int[n/2];
			int a_index=0,b_index=0; // 위의 두 배열에 값을 저장하기 위한 인덱스 변수
				
			for(int i=0;i<n;i++) { // 방문 배열을 탐색한다.
				if(check[i]==1) { // 선택된 사람들의 경우
					a[a_index++] = i; // a 배열에 저장
				}else { // 나머지 사람들은
					b[b_index++] = i; // b 배열에 저장
				}
			}
	        
	        // a와 b배열에 저장 된 사람들의 능력치를 계산
			start = divide(a);
			link = divide(b);
	        
	        // 두 팀의 능력치 차이를 절댓값화 하여 
			int result = Math.abs(start-link);
	        
	        // 최솟값을 찾는다.
			min = Math.min(result,min);
			
		}
		
		static int divide(int[] arr) { // 두 팀의 능력치를 계산하는 메소드
			int result = 0;
			
			for(int i=0;i<arr.length;i++) { // 두 사람을 선택해 능력치를 계산
				for(int j=i+1;j<arr.length;j++) { // 조합이므로 앞선 사람의 다음 사람부터 탐색
					result = result + map[arr[i]][arr[j]] +map[arr[j]][arr[i]] ; // 두 경우를 모두 더해준다.'
				}			
			}
			
			return result; // 능력치 결과 리턴
		}
		
		public static void main(String[] args)   {
			Scanner sc = new Scanner(System.in);
			
			n = sc.nextInt();
			map = new int[n][n];
			check = new int[n];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			dfs(-1,0); // 0번 인덱스부터 시작하므로 -1을 전달.
			System.out.println(min);
			
			
		}

	}