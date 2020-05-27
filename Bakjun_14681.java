package solution;

import java.util.Scanner;

public class Bakjun_14681 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    int Result = 1;
	    if(A>0 && B>0) {
	    	 Result = 1;
	    }else if(A>0 && B<0) {
	    	 Result = 4;
	    }else if(A<0 && B>0) {
	    	 Result = 2;
	    }else if(A<0 && B<0) {
	    	 Result = 3;
	    }
	    
		System.out.println(Result);
	    
	    sc.close();
		

	    
	
	 
	    
	}
}
