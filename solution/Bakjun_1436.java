package solution;

import java.util.Scanner;

public class Bakjun_1436{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    int i = 0;	
	    int find =0;	    
	  
	    	while(true) {
	    		i++;	    		
	    		String chk=String.valueOf(i);
	    		
	    		if(chk.contains("666")){
	    			find++;
	    		}
	    		
	    
	    		if(find==N) {	    			
	    			break;
	    		}	    		
	    	}
	    	System.out.println(i);
	    sc.close();	
	 
	    
	}
}
