package solution;

import java.util.Scanner;

public class Sugar {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();	
	    sc.close();
	    int b = a/5;
	    int c = a%5;
	    int d = b/3;
	    
	    
	     
	    if(b>0) {
	    switch(c) {
		case  0 :
		System.out.println(b);
		break;
		case  1 :
		System.out.println(b+1);
		break;
		case 2 : 
		System.out.println(b+1);
		break;
		case 3 : 
			System.out.println(b+1);
			break;
		
	    case 4 : 
		System.out.println(b+1);
		break;
	}	    
	}else {
		System.out.println(1);
	}
	
	    
	}
	
}
