package solution;

import java.util.Scanner;

public class CodeForce_Display {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
	      	  
		   int testCnt =0;
		 
	      
		   String rstArr[];		   
		   
		   testCnt= Integer.parseInt(sc.nextLine()); 	
		   
		   rstArr = new String[testCnt];	
		   
		   for ( int x= 0 ; x < testCnt ; x++) {
	 	   String move = "";
	 	   int tmp =sc.nextInt();
	 	   
		   if(tmp%2==0) {
			   move = "1";
		   } else {
        	  move = "7";
		   }
		
		   for(int i=1;i<tmp/2;i++) {
			   move = move+"1";
		   }
		   rstArr[x] =move;
		   }
		 
	    	  sc.close();
	    	  for(int z= 0 ; z < testCnt; z++) {
				   System.out.println(rstArr[z]);
			   }
			

		   }//메인메소드종료
	    
	}//클래스종료

