package solution;

import java.util.Scanner;

public class Bakjun_2331{
	 public static void main(String[] args)    {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt(); 
   
     int sum = 0;
     
     for(int i=0;i<T;i++) {
    	 
    	 
         String temp = String.valueOf(i);
         sum = i;
         for(int j=0;j<temp.length();j++) {
        	sum=sum+Integer.parseInt(String.valueOf(temp.charAt(j)));
         }
      
    	 if(sum==T) {
    		 System.out.println(i);
    		 break;
    	 }
    	
    	 if(i==T-1) {
    		 System.out.println(0);
    	 }
     }
     
     
     sc.close();
 
	 }

}