package solution;

import java.util.Scanner;

public class CodeForce_Quiz {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
	      	  
		   double s = 0;
		   double r = 0;
		   double i=1;
		   double sum = 0;
		   s = sc.nextInt();
		 		   	
		   
		   sc.close();

		   for(i=0; i< s; i++){
           
			   r =1/(s-i);
			   sum = sum+r;
		   }
		   System.out.println(sum);
	
		   
		   }//메인메소드종료
	    
	}//클래스종료

