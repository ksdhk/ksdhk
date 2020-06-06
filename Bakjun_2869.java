package solution;

import java.util.Scanner;

public class Bakjun_2869 {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
	
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		
    	    int D = A-B;
		    int E = C-A;
		    int result=0;
		    
		    if(E%D!=0) {
		    	result=E/D+2;
		    }else {
		    	result=E/D+1;
		    }
		    
	    	  sc.close();
			 System.out.println(result);
	
		   }//메인메소드종료
	    
	}//클래스종료

