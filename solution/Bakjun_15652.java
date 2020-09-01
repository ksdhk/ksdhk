package solution;

import java.util.Scanner;

	public class Bakjun_15652 {
		static int[] Output = new int[10];
		
		static void Backtracking(int index, int N, int M) {
			if(index == M) {
				for(int i = 0; i < M; i++) {
					System.out.print(Output[i]);
					if(i != M-1)
						System.out.print(' ');
				}
				System.out.println();
				return;
			}
			
			for(int i = 1; i <= N; i++) {
				Output[index] = i;
				if(index == 0)
					Backtracking(index + 1, N, M);
				else if(index > 0 && Output[index] >= Output[index-1])
					Backtracking(index + 1, N, M);
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			Backtracking(0, N, M);
	}
	}