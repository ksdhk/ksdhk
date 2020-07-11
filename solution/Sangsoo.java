package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sangsoo {

	  public static void main(String[] args) throws IOException{

		  /*������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. 
		   * �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���.
		   *  ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
             ����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�,
              ����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
             �� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
          
        */
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String[] input = br.readLine().trim().split(" ");
		        int a = Integer.parseInt(input[0]);
		        int b = Integer.parseInt(input[1]);
		        
		        // ���ο� a, b
		        int new_a = 0, new_b = 0;
		        new_a = (a%10)*100 + ((a%100)/10)*10 + (a/100);
		        new_b = (b%10)*100 + ((b%100)/10)*10 + (b/100);
		        
		        // Display
		        System.out.println((new_a>new_b)?new_a:new_b);
		    }


	//	��ó: https://hongku.tistory.com/242 [IT�� ���ϰ� :: ��̷� �ϴ� ����]
	    		    	
	  }	

