package solution;

import java.util.Scanner;

public class Bakjun_4948 {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int m=1;
		
		while(true) {
			m=s.nextInt();
			if (m==0) break;
			int n=m*2;
			int cnt=0;
			boolean[] data= new boolean[n+1];
			
			data[0]=false;data[1]=false;
			for(int i=2;i<=n;i++) data[i]=true;
			for(int i=2;i<=n;i++) 
				for(int j=2;j*i<=n;j++) 
					data[i*j]=false;
			for(int i=m+1;i<data.length;i++) 
				if (data[i]) cnt++;
			System.out.println(cnt);
		}
		   }//메인메소드종료 
	
	}//클래스종료

