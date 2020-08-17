package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bakjun_1181{
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		String[] a=new String[T];
		
		String ent= sc.nextLine();
		
		for(int i=0;i<T;i++) {
			
			 a[i]= sc.nextLine();
			
			
		}
		
		Arrays.sort(a);
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<51;i++) {
		for(int j=0;j<T;j++) {
		if(i==a[j].length()&&!list.contains(a[j])) {			
			list.add(a[j]);
		}			
		}
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		sc.close();
	}
}
