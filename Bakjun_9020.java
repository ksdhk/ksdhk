package solution;

import java.util.Scanner;

public class Bakjun_9020 {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
		   String answer="";
		   int i=0;
		   int j=0;
	   
		   int T = sc.nextInt();
		   
		   for(int k=0;k<T;k++) {
		   
		 
		    int S  = sc.nextInt();
		
		    int a []=new int [S+1];
		  
		   
		    for (i = 0; i <= S; i++) {
		    	a[i] = 0;		 
		    }
			    a[1] = 1;
			
			for (i = 2; i <= S; i++) {
				for (j = 2; i*j <= S; j++) {
					a[i * j] = 1;
				}
			};
						
			
			for (i = 2; i <= S/2; i++) {
				if(a[i] != 1) {
					j = S-i;
					if(a[j]!=1) {
								answer=i+" "+j;	
					     }
					}
				}
			   System.out.println(answer);	    
        
		   }

		   sc.close();
		   }//메인메소드종료 
	
	}//클래스종료

