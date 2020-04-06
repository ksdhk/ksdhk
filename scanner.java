package solution;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 하나 입력하세요>");
		
	    String a = scanner.nextLine();
	    String b = scanner.nextLine();
	    int num = Integer.parseInt(a)-Integer.parseInt(b);	    
	    System.out.println(num);
	}
	
}
