package solution;

import java.util.Scanner;

public class Bakjun_1388_IF {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();
	
    if(A>B) {
    System.out.println(">");
    }else if(A<B) {
    	System.out.println("<");
    }else if(A==B) {
    	System.out.println("==");
    }
    
}
}
