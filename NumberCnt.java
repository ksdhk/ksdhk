package solution;

import java.util.Scanner;

public class NumberCnt {
public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    int C = sc.nextInt();
	    sc.close();

	    String result =String.valueOf(A* B *C) ;
	    int Cnt =0;
		for(int j= 0;j<10;j++) {
	    for(int i=0;i<result.length();i++) {
		      	if(String.valueOf(j).equals(String.valueOf(result.charAt(i)))) {
	      		Cnt++;
	    	}	    		
	    	}
	    	System.out.println(Cnt);
    		Cnt =0;
	    }
	    
	
	}
}
