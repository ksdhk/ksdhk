package solution;

import java.util.Scanner;

public class ASCII {
	
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	    
	       String Literal = sc.next();   //왜깨짐?
	       sc.close();
	        
	        
	        System.out.println(Literal.hashCode());
	    }   

	

}
