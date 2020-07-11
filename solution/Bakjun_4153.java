package solution;

import java.util.Scanner;

public class Bakjun_4153{
	public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
		String wr="";
	   while(true) {
		  int a= sc.nextInt();
		  int b= sc.nextInt();
		  int c= sc.nextInt();
		
		   if(a==0&&b==0&&c==0) {
			   break;
		   }
		   
		   if(a*a==b*b+c*c) {
			   wr = "right";
		   }else if(b*b==a*a+c*c) {
			   wr = "right";
		   }else if(c*c==a*a+b*b) {
			   wr = "right";
		   }else {
			   wr = "wrong";
		   }

		   System.out.println(wr);
	
	   }
		   sc.close();
		   
		   }//메인메소드종료 
	
	}//클래스종료

