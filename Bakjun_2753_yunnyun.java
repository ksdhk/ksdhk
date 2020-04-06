package solution;

import java.util.Scanner;

public class Bakjun_2753_yunnyun {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	  
	    sc.close();
		
	    if(A%4==0&A%100!=0) {
	    System.out.println("1");
	    }else if(A%400==0) {
	    System.out.println("1");
	    }else  {
	     System.out.println("0");
	    }	    
	}
	}
