package solution;

import java.util.Scanner;

	public class Bakjun_2748 {
	
		
		static int n;
		static long check[] = new long[91]; // long형 배열
		
		
		public static void main(String[] args)   {
			Scanner sc = new Scanner(System.in);
			
			n= sc.nextInt();
			check[0]= 0; // 0번, 1번 숫자는 미리 저장해둔다.
			check[1] =1;
			
			for(int i=2;i<=n;i++) { // 2번 숫자부터 반복 시작
				check[i] = check[i-1] + check[i-2];
			}
			System.out.println(check[n]); // n번 째 숫자 출력
			
			
		}

	}