package solution;

import java.util.Scanner;

public class Bakjun_10872 {
	
	
	public static int factorial(int n){
	    if(n>2) {
		return factorial(n-1)*n;
		}			
		else {
		return n;
		}
	};
	
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	     s.close();	     
	     if(a==0) {
	    	 System.out.println(1);
	     }else {
	     System.out.println( factorial(a));
	     }
 }    
}