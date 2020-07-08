package solution;

import java.util.Scanner;

public class Bakjun_10996 {
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	  
	    
	    for(int i=0;i<a;i++) {
	    	  String aLine = "*";
	  	      String bLine = "";
	    	for(int j=1;j<a;j++) {
	    	if(j%2==0) {
	    		aLine=aLine+" *";
	    	}else {
	    		bLine=bLine+" *";
	    	}
	    	}
	    	System.out.println(aLine);
	    	System.out.println(bLine);
	    }
	  
 
	 
	     s.close();
	       
 }    
}