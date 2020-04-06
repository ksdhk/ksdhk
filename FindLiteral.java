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
	    	char ch = a.charAt(i); //입력받은 문자 나누기
	    	int ch2 = (int)ch; //문자를 INT 형으로 바꾸기 즉,ASCII CODE 값으로 변경
	    	int ch3 = ch2-97; // 문자 a의 아스키코드값은 97 이므로 97을 빼 0으로 변경
	    	if(asc[ch3]==-1) { //배열에 든 숫자가 -1이 아니면 카운터 1씩 증가한 후 배열에 삽입
	    		asc[ch3]=cnt++; 
	    	}else { //배열에 -1이 아닌 숫자가 들었을때, 즉 알파벳이 2번이상 쓰였을때 cnt값만 증가
	    		cnt=cnt+1;	
	    	}
	    	}
	    	for(int i=0; i<26; i++) {
	    		System.out.print(asc[i]);
	    		System.out.print(" ");
	    	}
	    }
	
}
