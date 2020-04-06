package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sangsoo {

	  public static void main(String[] args) throws IOException{

		  /*상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
		   * 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
		   *  상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
             상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734과 893을 칠판에 적었다면,
              상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
             두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
          
        */
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String[] input = br.readLine().trim().split(" ");
		        int a = Integer.parseInt(input[0]);
		        int b = Integer.parseInt(input[1]);
		        
		        // 새로운 a, b
		        int new_a = 0, new_b = 0;
		        new_a = (a%10)*100 + ((a%100)/10)*10 + (a/100);
		        new_b = (b%10)*100 + ((b%100)/10)*10 + (b/100);
		        
		        // Display
		        System.out.println((new_a>new_b)?new_a:new_b);
		    }


	//	출처: https://hongku.tistory.com/242 [IT에 취하개 :: 취미로 하는 개발]
	    		    	
	  }	

