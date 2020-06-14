package solution;

import java.util.Scanner;

public class Bakjun_1978 {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
	
		    int T= sc.nextInt();
		    int CNT = 0;
		    boolean tf = true;
		    
		    for(int i=0;i<T;i++) {
		    int S  = sc.nextInt();
		
		    if(S<=1) {
		    	tf = false;
		    }else {		   
		       for(int j=2;j<=S/2;j++) {
		    	if(S%j==0){tf=false;
		    	          }
		              }		       
		  	      }
		 
		     if(tf) {
			    	CNT++;			    	
		     }	
			    			     
		     tf = true;			  
		    
		 	    
			 
		    }
		    
		    System.out.println(CNT);
		    sc.close();
		    		    
		   }//메인메소드종료 
	
	}//클래스종료

