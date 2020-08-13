package solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Bakjun_2750{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    int[] num = new int[N];
	for(int i=0;i<N;i++) {		
		num[i]=sc.nextInt();
	}
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    for(int i=0;i<num.length;i++) {
	    list.add(num[i]);
	    }
	    
	    list.sort(null);;
	    
	    for(int i=0;i<list.size();i++) {
	    System.out.println(list.get(i));
	    }
	    
	    sc.close();	
	 
	    
	}
}
