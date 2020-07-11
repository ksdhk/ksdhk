package solution;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		    int x = sc.nextInt();
		    sc.nextLine();  
		    String y = sc.nextLine();
		    sc.close();
		    
		int sum = 0;
		//System.out.println("x:"+x+":y:"+y);
		for(int i =0;i<x; i++) {
			sum+=Integer.parseInt( y.substring(i, i+1));	
			
		}
		System.out.println(sum);
	}
	}
	

