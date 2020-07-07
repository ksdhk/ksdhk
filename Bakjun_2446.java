package solution;

import java.util.Scanner;

public class Bakjun_2446 {
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	    int pad = 0;
	    
	    for(int i=a;i>0;i--){
	        
	    for(int k=0;k<pad;k++){
	        System.out.print(" ");
	    }
	    
	    for(int j=0;j<i*2-1;j++){
	        System.out.print("*");
	    }
	    System.out.println();
	        
	    pad++;
	    }
 
	    pad--;
	    pad--;
	    for(int i=2;i<=a;i++){
	        for(int k=0;k<pad;k++){
	            System.out.print(" ");
	        }
	        for(int j=0;j<i*2-1;j++){
	            System.out.print("*");
	            };
	            System.out.println();
	        pad--;
	    }   
	        
	     s.close();
	       
 }    
}