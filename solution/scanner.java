package solution;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ� ������ �ϳ� �Է��ϼ���>");
		
	    String a = scanner.nextLine();
	    String b = scanner.nextLine();
	    int num = Integer.parseInt(a)-Integer.parseInt(b);	    
	    System.out.println(num);
	}
	
}
