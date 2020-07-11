package solution;

import java.util.Scanner;

public class TenLetterPrint {

	public static void main(String[] args) {
		/*���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
�� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
		
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
