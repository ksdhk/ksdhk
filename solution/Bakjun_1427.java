package solution;

import java.util.Arrays;
import java.util.Scanner;

public class Bakjun_1427{
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
	
		char[] a= new char[N.length()];
	   
		for(int i=0;i<a.length;i++) {
			a[i]=N.charAt(i);
			}
		
		Arrays.sort(a);
		
		for(int i=a.length-1;i>-1;i--) {
		System.out.print(a[i]);
		}
		sc.close();
	}
}
