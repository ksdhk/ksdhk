package solution;

import java.util.Scanner;

public class Bakjun_2775 {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
	
		    int T= sc.nextInt();
		    
		    for(int i=0;i<T;i++) {
		    int k = sc.nextInt();
		    int n = sc.nextInt();
		    System.out.println(recursive(k,n));
			 
		    }
		    sc.close();
		    		    
		   }//메인메소드종료
		  
	
	private static int recursive (int k, int n) {
	if(n==0) {
		return 0;
	}  else if (k == 0) {
        return n;
	} else {
        return recursive(k, n - 1) + recursive(k - 1, n);
    }	
	}
	
	}//클래스종료

