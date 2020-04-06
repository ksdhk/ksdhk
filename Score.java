package solution;

import java.util.Scanner;

public class Score {

	
	public static void main(String[] args) {
			
		/*시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		  */
		
	    Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    sc.close();
	    
	    String score="";
	          if(input>89) {
	    	score="A";
	    }else if(input>79) {
	    	score="B";
	    }
	    else if(input>69) {
	    	score="C";
	    }
	    else if(input>59) {
	    	score="D";
	    }else {
	    	score="F";
	    }
	    
	    System.out.println(score);
	    
	}
	
}
