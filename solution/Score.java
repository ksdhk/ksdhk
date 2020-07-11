package solution;

import java.util.Scanner;

public class Score {

	
	public static void main(String[] args) {
			
		/*���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
