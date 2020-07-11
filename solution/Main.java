package solution;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    sc.close();
    
  for(int i=1;i<=input;i++) {
	  for(int q=i ;q<input;q++) {
		  System.out.print(" ");
	  }
	  for(int j=0;j<i;j++) { 
	  System.out.print("*")    ;
	  }
	  System.out.println();
}
  
}
}




