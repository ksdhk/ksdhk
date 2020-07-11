package solution;

import java.util.Scanner;

public class Backjun_2588_multiple {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    sc.close();
	    
	    System.out.println(a*(b%10));
	    System.out.println(a*(b/10%10));
	    System.out.println(a*(b/100%10));
	    System.out.println(a*b);
	}
}
