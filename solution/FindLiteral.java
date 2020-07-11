package solution;

import java.util.Scanner;

public class FindLiteral {

	
	  public static void main(String[] args){
	    	int cnt=0;
	    	int[] asc = new int[26];
	    	for(int i=0; i<26; i++) {
	    		asc[i] =-1;
	    	}
	    	Scanner sc = new Scanner(System.in);
	    	String a =sc.nextLine();
	    	for(int i=0; i<a.length(); i++) {
	    	char ch = a.charAt(i); //�Է¹��� ���� ������
	    	int ch2 = (int)ch; //���ڸ� INT ������ �ٲٱ� ��,ASCII CODE ������ ����
	    	int ch3 = ch2-97; // ���� a�� �ƽ�Ű�ڵ尪�� 97 �̹Ƿ� 97�� �� 0���� ����
	    	if(asc[ch3]==-1) { //�迭�� �� ���ڰ� -1�� �ƴϸ� ī���� 1�� ������ �� �迭�� ����
	    		asc[ch3]=cnt++; 
	    	}else { //�迭�� -1�� �ƴ� ���ڰ� �������, �� ���ĺ��� 2���̻� �������� cnt���� ����
	    		cnt=cnt+1;	
	    	}
	    	}
	    	for(int i=0; i<26; i++) {
	    		System.out.print(asc[i]);
	    		System.out.print(" ");
	    	}
	    }
	
}
