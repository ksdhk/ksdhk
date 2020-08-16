package solution;

import java.util.Arrays;
import java.util.Scanner;

public class Bakjun_11651{
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		int[][] arr = new int[T][2];
		
		for(int i = 0; i < T; i++) {
			arr[i][1] = sc.nextInt();
			arr[i][0] = sc.nextInt();
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < T; i++) {
			System.out.println(arr[i][1] + " " + arr[i][0]);
		}
		
		
		sc.close();
	}
}
