package solution;

import java.util.Scanner;

public class Bakjun_1193 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    
	    int n =1;
	    int sum=1;
	    while(A>sum) {
	    	n=n+1;
	    	sum=sum+n;
	    };
	    
	    int step=A-(sum-n);
	    
	    
	    if(n%2==1) {
	    	System.out.println((n+1-step)+"/"+ step);	
	    }else {
	    	
	    	System.out.println(step+"/"+(n+1-step) );
	    }
	    sc.close();	
	 
	    
	}
}
