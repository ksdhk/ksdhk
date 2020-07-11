package solution;

import java.util.Scanner;

public class Bakjun_10250 {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
	
		    int T= sc.nextInt();
		    
		    for(int i=0;i<T;i++) {
		    int H  = sc.nextInt();
		    int W = sc.nextInt();
		    int N = sc.nextInt();
		    
		    int r1 = N%H;
		    int r2 = N/H+1;
		 
		    if(N%H==0) {
		    	r1 = H;
                r2 = N/H;
                
            }
		    
		    System.out.println(r1*100+r2);
			 
		    }
		    sc.close();
		    		    
		   }//메인메소드종료
		  
	 

	
	}//클래스종료

