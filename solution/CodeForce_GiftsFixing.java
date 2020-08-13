package solution;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeForce_GiftsFixing {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
		  
	      int T = sc.nextInt();
	      
	      for(int i=0;i<T;i++){
	    	 
	    	  ArrayList<Integer> list = new ArrayList<Integer>();
	    	  int st = sc.nextInt();
	    	  int[] arr = new int[st];
	     
	    	  for(int j=0;j<st;j++){
	    		  arr[j]=sc.nextInt();
	    	  }
	    	  
	    	  for(int k=0;k<arr.length-1;k++) {
	    	
	    		 int abs =Math.abs(arr[k]-arr[k+1]);
	    	     if(abs<2) {
	    	    	 if(arr[k]<arr[k+1])
	    	    	 arr[k]=-1;
	    	    	 if(arr[k]>arr[k+1])
	    	         arr[k+1]=-1;
	    	    	 if(arr[k]==arr[k+1])
	    	    		 arr[k]=-1; ;
	    	     }
	    	  }
	    	  for(int k=0;k<arr.length;k++) {
	    		  
	    		  if(arr[k]!=-1) {
	    			  list.add(arr[k]);
	    		  }
	    	  }
	    	  
	    	  
	    	  if(list.size()!=1) {
	    		  System.out.println("NO");
	    	  }else {
	    		  System.out.println("YES");
	    	  }
	    	  
	      }
		  
		   sc.close();
		 
		
		   
		   }//main method
	    
	}//class

