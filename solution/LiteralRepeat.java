package solution;

import java.util.Scanner;

public class LiteralRepeat {

	  public static void main(String[] args){

		  /*���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
          QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.
          
        */
		  
	    	Scanner sc = new Scanner(System.in);
	    	int cnt = sc.nextInt();
	    	
	        String[] cases = new String[cnt];
	    	int[] numbs = new int[cnt];
	        
	    	for(int i = 0 ; i < cnt ; i++){  //�׽�ƮȽ����ŭ �ݺ�����,���ڿ� �迭 ����
	    		numbs[i] = sc.nextInt();
	    		cases[i] =sc.nextLine();
	    	}
	    	for(int i = 0 ; i < cnt ; i++){     //�׽�Ʈ Ƚ����ŭ ����
	     		for(int j = 1;j<cases[i].length();j++) {   //���ڿ�����(����κ�+1����) ��ŭ �ݺ�
	    			for(int k=0;k<numbs[i];k++) {               //�ݺ����ڸ�ŭ �ݺ�
	    			System.out.print(cases[i].charAt(j));         //�ؽ�Ʈ ���
	    			}
	    		}
	    		System.out.println("");      //�׽�Ʈ ���ٸ��� �����Է�
	    	}
	    	
	    		    	
	  }	
}
