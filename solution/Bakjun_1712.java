package solution;

import java.util.Scanner;

public class Bakjun_1712 {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
	
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		
		    int cnt = 1;
	      
	      if(B>=C) {
	    	  cnt=-1;
	      }else {
	    	cnt=A/(C-B)+1;
	      }
		    
		    
	    	  sc.close();
			 System.out.println(cnt);
	
		   }//메인메소드종료
	    
	}//클래스종료

