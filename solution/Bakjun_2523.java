package solution;

import java.util.Scanner;

public class Bakjun_2523 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	
	    String star="*";
	    int i=0;
	    
	   for( i=0;i<A;i++) {
		   System.out.println(star);
		   
		   star+="*";
	   }
	   star=star.substring(0,star.length()-2);
	   for(int j=i;j>1;j--) {
		   System.out.println(star);
		   
		   star=star.substring(0,star.length()-1);
	   }
	   
	    
	}
}
