package solution;

import java.util.Scanner;

public class Bakjun_5543 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    int C = sc.nextInt();
	    int D = sc.nextInt();
	    int E = sc.nextInt();
	    
	    int minBurger = A;
	    int minBeverage = D;
	    
	    if(minBurger>B) {
	    	minBurger = B;
	    }
	    if(minBurger>C) {
	    	minBurger = C;
	    }
	    if(minBeverage>E) {
	    	minBeverage=E;
	    }
	    
	    int tot = minBurger+minBeverage-50;
	    
	    System.out.println(tot);
	    
	    sc.close();
		
	 
	    
	}
}
