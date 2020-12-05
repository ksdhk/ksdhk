package solution;

import java.util.*;

class programmers_difNumber {
	  public int[] solution(int []arr) {
	        ArrayList<Integer> list = new ArrayList();
	        for(int i=0;i<arr.length;i++){
	         if(i==0||i>0&&arr[i-1]!=arr[i]){    
	         list.add(arr[i]) ;
	         }
	        }
	        int[] answer = new int[list.size()];
	        for(int j=0;j<list.size();j++){
	            answer[j] = list.get(j);
	        }
	      
	        return answer;
	    }
}