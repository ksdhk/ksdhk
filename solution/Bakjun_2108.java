package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bakjun_2108{
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] a = new int[T];
		for(int i=0;i<T;i++) {
			 a[i]=sc.nextInt();
		};
		
		int sum=0;
		int mid = 0;
		int min = 0;
		int range = 0;
		
		int maxK=0;
		int temp=0;
		
		
		ArrayList<Integer> List = new ArrayList<Integer>();
		ArrayList<Integer> there = new ArrayList<Integer>();
				
		Arrays.sort(a);
		for(int j=0;j<a.length;j++) {
			
			//산술평균
			sum+=a[j];
			
			//중앙값
			if(j==a.length/2) {
				mid=j;
			}			
			
			
			
			//범위
			if(j==0) {
				range=a[j];
			}
			
			if(j==a.length-1) {
				range=a[j]-range;
			}
			
			
			//최빈값
			if(!there.contains(a[j])) {
			 there.add(a[j]);
			 
			   for(int k=j+1;k<a.length;k++) {
				  if(a[j]==a[k]) {				
					  temp++;
				  }
				  
			   }
			
			   if(temp>maxK){
				   maxK=temp;	
				   List.clear();
				   List.add(a[j]);
			   }
			   if(temp!=0&&temp==maxK) {
			      List.add(a[j]);
			   }
			}
			   temp=0;
			
			
			
		}
	
		;
		
		if(List.size()>1) {
			min=List.get(1);
		}else {
			min=List.get(0);
		}
		
		
		sum=sum/a.length;
		
		System.out.println(sum);
		System.out.println(mid);
		System.out.println(min);
		System.out.println(range);
		sc.close();
	}
}
