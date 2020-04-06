package solution;

import java.util.Scanner;

public class Bakjun_2562 {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
	      	  
		   int Max = 0;
		   int Cnt = 0;
		   
      	  int[] numbers = new int[9]; 
	    	   for(int i=0; i<9; i++){ 
			       		
	    		   numbers[i]=   sc.nextInt(); 	
	    		  
	    		
	    			   if(numbers[i] > Max) {
	    			   Max = numbers[i];
	    			   Cnt = i+1;	    			 
	    			   }
			  
			   } //for문종료
	    	  sc.close();
			 System.out.println(Max);
			 System.out.println(Cnt);
		   }//메인메소드종료
	    
	}//클래스종료

