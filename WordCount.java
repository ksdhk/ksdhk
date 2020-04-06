package solution;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
			
			 Scanner sc = new Scanner(System.in);
			    String y = sc.nextLine();
			    sc.close();
	
	
			    y=y.trim();
			    String[] rest = y.split(" ");
			    
			    System.out.println(rest.length);
		
	}
}
