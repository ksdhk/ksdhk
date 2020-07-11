package solution;

import java.util.Scanner;

public class Avg {
/*�����̰� ����ġ�� ������ �� ���� ������ �������� ����, ����, ���, ��, �����̴�.
���� �� ������ �⸻��簡 �־���, �����̴� ���� �л����� �⸻��� �������� ä���ϰ� �ִ�. �⸻��� ������ 40�� �̻��� �л����� �� ���� �״�� �ڽ��� ������ �ȴ�. ������, 40�� �̸��� �л����� �����н��� ��� ������ �����ϸ� 40���� �ް� �ȴ�. �����н��� �ź��� �� ���� ������, 40�� �̸��� �л����� �׻� 40���� �ް� �ȴ�.
�л� 5���� ������ �־����� ��, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	    
	        String[] cases = new String[5];
	        for (int i = 0; i < 5; i++) {
	            cases[i] = sc.next();   //5�� �����Է¹޾Ƽ� �迭�� �Է�
	        }
	        sc.close();
	        
	        int tot=0;
	        for(String result:cases) {  //�迭 ũ�⸸ŭ for�� ���鼭 ��Ʈ���� �Է�
	        	if(Integer.parseInt(result)<40) { //40�������Ͻ� 40������
	        		result="40";
	        	}
	        	tot+=Integer.parseInt(result); //�� �հ� ����
	        }
	        tot= tot/5; //��հ� ���
	        System.out.println(tot);
	    }
	
	
}

