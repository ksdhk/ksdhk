package solution;

import java.util.Scanner;

public class Bakjun_1929 {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
		  
		   int i=0;
		    int j=0;
		    int f = sc.nextInt();
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
			}

			for (i = f; i <= S; i++) {
				if(a[i] != 1)
				System.out.println(i); 	
			}
	    
		    
		 
		   
		    sc.close();
		    		    
		   }//메인메소드종료 
	
	}//클래스종료

