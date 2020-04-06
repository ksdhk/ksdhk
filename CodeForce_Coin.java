package solution;

import java.util.Scanner;

public class CodeForce_Coin {
	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
		  
		   int testCnt =0;
		   int a = 0;
		   int b = 0;
		   int c = 0;
		   
		   int n = 0;		   
	
		   testCnt = Integer.parseInt(sc.nextLine()); 	
		   
			  String result[]=new String[testCnt];
		   
		
		 
		   for ( int x= 0 ; x < testCnt ; x++) {
				 
		 
		   a = sc.nextInt();
		   b = sc.nextInt();
		   c = sc.nextInt();
		   n = sc.nextInt();
		   
		   
		  while (a>b) {
			   b++;
			   n--;
		   }
		  ;
		  while (b>a) {
			   a++;
			   n--;
		   }
		  while (b>c) {
			   c++;
			   n--;
		   }
		  ;
		  while (c>b) {
			   b++;
			   n--;
		   }
		  while (c>a) {
			   a++;
			   n--;
		   }
		  ;
		  while (a>c) {
			   c++;
			   n--;
		   }
		
		  
		  if(n%3==0&&n>0) {
			   result[x]="YES";
		  }else {
			  result[x]="NO";
		  }  
	
		 
		
		   }
		   sc.close();
		 
		   for(int i=0;i<testCnt;i++){
			System.out.println(result[i]);
		   }
		   
		   }//메인메소드종료
	    
	}//클래스종료

