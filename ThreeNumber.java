package solution;

import java.util.Scanner;

public class ThreeNumber {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    int C = sc.nextInt();
	    sc.close();

	     int second = 0;
	
	    if(A>=B&&A<=C) {
	    	second = A;
	    }
	    else if(A>=C&&A<=B){
	    	second = A;	   
	    	}	    	    
	    else if(B>=C&&B<=A){
	    	second = B;
	    }	    
	    else if(B>=A&B<C){
	    	second = B;
	    }else {
	    	second = C;
	    }
	    
	  System.out.println(second);
		
	}
	
}
