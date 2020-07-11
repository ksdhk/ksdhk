package solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class FastAB {
public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //����
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//����

	int iLines = Integer.parseInt(br.readLine()); //Int
	int a,b;
	
	for(int i=0; i <iLines;i++) {
	StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer���ڰ��� �Է� ���ڿ� ����
	 a = Integer.parseInt(st.nextToken()); //ù��° ȣ��
	 b = Integer.parseInt(st.nextToken()); //�ι�° ȣ��

	 bw.write(a+b+"\n");//���
	}	
	
	bw.flush();//�����ִ� �����͸� ��� ��½�Ŵ
	
	
}

}