package solution;

import java.util.Scanner;

public class Bakjun_1085 {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
		
	   
		   int x = sc.nextInt();		 
		   int y = sc.nextInt();
		   int w = sc.nextInt();
		   int h = sc.nextInt();
		   sc.close();
	
		   int b = w-x;	
		   int d = h-y;
		   
		   int min = x;
		   if(min>y) {
			   min= y;
		   }if (min>b) {
			   min = b;
		   }if (min>d) {
			   min = d;
		   }
		   

		   System.out.println(min);
		  
		   }//메인메소드종료 
	
	}//클래스종료

