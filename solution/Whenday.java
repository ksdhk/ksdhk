package solution;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Whenday {

	
	public static void main(String[] args) {
		
		/*������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
		ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����. ����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���
		, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.
		 * */
		   Scanner sc = new Scanner(System.in);
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    sc.close();
		
		
		GregorianCalendar gc=new GregorianCalendar ( 2019, x-1 , y);   //���� -1�� �������
		String [] day = { "", "SUN", "MON", "TUE","WED","THU","FRI","SAT" };   //1���� �����ϹǷ� 0 ���� ""
		String yo_il = day [ gc.get ( gc.DAY_OF_WEEK ) ];

        System.out.println(yo_il);
		
	}
	
}
