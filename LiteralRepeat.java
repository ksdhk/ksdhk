package solution;

import java.util.Scanner;

public class LiteralRepeat {

	  public static void main(String[] args){

		  /*문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
          QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
          
        */
		  
	    	Scanner sc = new Scanner(System.in);
	    	int cnt = sc.nextInt();
	    	
	        String[] cases = new String[cnt];
	    	int[] numbs = new int[cnt];
	        
	    	for(int i = 0 ; i < cnt ; i++){  //테스트횟수만큼 반복숫자,문자열 배열 지정
	    		numbs[i] = sc.nextInt();
	    		cases[i] =sc.nextLine();
	    	}
	    	for(int i = 0 ; i < cnt ; i++){     //테스트 횟수만큼 수행
	     		for(int j = 1;j<cases[i].length();j++) {   //문자열길이(공백부분+1시작) 만큼 반복
	    			for(int k=0;k<numbs[i];k++) {               //반복숫자만큼 반복
	    			System.out.print(cases[i].charAt(j));         //텍스트 출력
	    			}
	    		}
	    		System.out.println("");      //테스트 한줄마다 엔터입력
	    	}
	    	
	    		    	
	  }	
}
