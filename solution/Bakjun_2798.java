package solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Bakjun_2798{
	 public static void main(String[] args)    {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt(); 
     int BlackJack = sc.nextInt(); 
     ArrayList<Integer> list = new ArrayList();
     
     for(int i=0;i<T;i++) {
    	 list.add(sc.nextInt());
     }
     
     int sum = 0;
     int answer = 0;
     int temp =0;
     
     for(int i=0;i<list.size()-2;i++) {
      for(int j=i+1;j<list.size()-1;j++) {
    	  for(int k=j+1;k<list.size();k++) {
    		  sum=list.get(i)+list.get(j)+list.get(k);
    		  
    		  if(sum<=BlackJack) {
    			  temp=sum;
    		  }
    		  if(BlackJack-temp<BlackJack-answer) {
    			  answer = temp;
    		  }
    	  }
      }
      
     }
     System.out.println(answer);
     
     sc.close();
 
	 }

}