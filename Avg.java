package solution;

import java.util.Scanner;

public class Avg {
/*상현이가 가르치는 아이폰 앱 개발 수업의 수강생은 원섭, 세희, 상근, 숭, 강수이다.
어제 이 수업의 기말고사가 있었고, 상현이는 지금 학생들의 기말고사 시험지를 채점하고 있다. 기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다. 하지만, 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다. 보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.
학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.
*/
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	    
	        String[] cases = new String[5];
	        for (int i = 0; i < 5; i++) {
	            cases[i] = sc.next();   //5명 점수입력받아서 배열에 입력
	        }
	        sc.close();
	        
	        int tot=0;
	        for(String result:cases) {  //배열 크기만큼 for문 돌면서 스트링에 입력
	        	if(Integer.parseInt(result)<40) { //40점이하일시 40점으로
	        		result="40";
	        	}
	        	tot+=Integer.parseInt(result); //총 합계 누적
	        }
	        tot= tot/5; //평균값 계산
	        System.out.println(tot);
	    }
	
	
}

