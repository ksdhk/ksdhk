package solution;

import java.util.Scanner;

public class CodeForce_Floor {
	public static void main(String[] args) {
	
		   Scanner scm = new Scanner(System.in);
		  
		   int testCnt =0;
		   int n = 0;
		   int s = 0;
		   int k = 0;
		   
		   int A = 0;		   
	
		   int rstArr[];
		   testCnt = Integer.parseInt(scm.nextLine()); 	
		   rstArr = new int[testCnt];
		   
		   for ( int x= 0 ; x < testCnt ; x++) {
		  Scanner sc = new Scanner(System.in);
		  
		   n = sc.nextInt();
		   s = sc.nextInt();
		   k = sc.nextInt();
		   
		   int aArray[] = new int[n] ;
		   
		   for(int i=0;i<n;i++) {
			   aArray[i]=i+1;			   
		   }
		   
		   
		   for(int i=0;i<k;i++) {
			
			   A = sc.nextInt();
			 
			   for(int j=0;j<n;j++) {
				   if(aArray[j]==A) {
					   aArray[j]=9999;
				   }				   			   
			   }			 
		   }
		  	  
	   	  
	    	  int minN = Math.abs(s-aArray[0]);
	    	  
	   	   for(int i=0;i<n;i++) {
			
	   		if( Math.abs(s-aArray[i])<minN) {
	   			minN = Math.abs(s-aArray[i]);
	   		}
	   		   
			   }
	  
	
	   	   int result =minN;
	   	 
	   	rstArr[x]=result;
	
	  if(testCnt-1==x) {
		  sc.close();}
		   }
		   
		   scm.close();
		  
		   for(int z= 0 ; z < testCnt; z++) {
			   System.out.println(rstArr[z]);
		   }
		 
		   
		   }//메인메소드종료
	    
	}//클래스종료

