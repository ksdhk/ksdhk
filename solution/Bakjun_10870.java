package solution;

import java.util.Scanner;

public class Bakjun_10870 {
	
	
	public static int Fibonacci(int n){
	  
		if(n==0) {
		return 0;
		}
		if(n==1) {
		 return 1;
		}
		
		return  Fibonacci(n-1)+Fibonacci(n-2);
	};
	
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	  s.close();
	     System.out.println( Fibonacci(a));
	 
 }    
}