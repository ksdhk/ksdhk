package solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class FastAB {
public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언

	int iLines = Integer.parseInt(br.readLine()); //Int
	int a,b;
	
	for(int i=0; i <iLines;i++) {
	StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
	 a = Integer.parseInt(st.nextToken()); //첫번째 호출
	 b = Integer.parseInt(st.nextToken()); //두번째 호출

	 bw.write(a+b+"\n");//출력
	}	
	
	bw.flush();//남아있는 데이터를 모두 출력시킴
	
	
}

}