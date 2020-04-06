package solution;

import java.util.Scanner;

public class TenLetterPrint {

	public static void main(String[] args) {
		/*알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.*/
		
		 Scanner sc = new Scanner(System.in);
		    String y = sc.nextLine();
		    sc.close();
		    
		    int x = y.length()/10;
		    int z = y.length()%10;	
			
		    for(int i =0; i<x;i++) {
		    	System.out.println(y.substring(0+(i*10), 10+(i*10)));
		    	
		    }
		    if(z!=0) {
		    	System.out.println(y.substring((x*10), (x*10)+z ));
		    }
		
	}
	
}
