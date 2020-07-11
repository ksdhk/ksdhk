package solution;

import java.util.Scanner;

public class Bakjun_2884_45m {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    sc.close();
		
	
	    
	    if(B>=45) {
	    	   System.out.println(A+" "+(B-45));
	    }else if(B<45){
	    	if(A-1<0) {
	    		A=24;
	    	}
	    	 System.out.println((A-1)+" "+(60+B-45));
	    }   
	 
	    
	}
}
