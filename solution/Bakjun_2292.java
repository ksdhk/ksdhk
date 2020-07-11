package solution;

import java.util.Scanner;

public class Bakjun_2292 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    
	    int Result =1;
	    int lev=1;
	    int sum=1+6*lev;
	    if(A==1){
	    	  Result =1;
	    }else {
	    	while(A>sum) {
	     lev++;
	     sum=sum+6*lev;
	    
	    	}
	    	 Result = ++lev;
	    }
	    
		System.out.println(Result);
	    
	    sc.close();
	
	 
	    
	}
}
