package solution;

import java.util.Scanner;

public class Bakjun_2581 {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
	
		 
		    boolean tf = true;
		    int min =10000;
		    int sum = 0;
		    
		    int f = sc.nextInt();
		    int S  = sc.nextInt();
		
		   
		       for(int j=f;j<=S;j++) {
		    	   

		    	   if(j==1) {
		    		   tf=false;
		    	   }
		    	   
	     	   for(int k=2;k<j;k++) {
		    	if(j%k==0){
		    		tf=false;
		    	           }
	     	   }	    
		    	
		    	if(tf==true) {		    		
		    		sum+=j;
		    	 if(min>j) {
		    		min=j;
		    	          }
		    	};
		    	tf=true;
		    	   }
		    	
		       
		    	if (sum == 0) {
					System.out.println(-1);
				}
		    	else {
		    	System.out.println(sum);
		    	System.out.println(min);
		    	}
		 
		   
		    sc.close();
		    		    
		   }//메인메소드종료 
	
	}//클래스종료

