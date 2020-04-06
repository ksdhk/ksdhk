package solution;

import java.util.Scanner;

public class star {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    sc.close();
	    
	  for(int i=input;i>0;i--) {
		
		  for(int q=input-i;q>0;q--) {
			  System.out.print(" ");
		  }
		  
	    for(int j=0;j<i;j++) { 
		  System.out.print("*")    ;
		  }
		  System.out.println();
	}
	  
	}
}
