package solution;

import java.util.Scanner;

class programmers_middlenumber {
	
	    public long solution(int a, int b) {
	          long answer = 0;
	        if(a==b){
	            answer = a;
	        }else if (a>b){
	            while(a>=b){
	            answer+=a;
	            a--;
	            }
	        }else if (b>a){
	                 while(b>=a){
	            answer+=b;
	            b--;
	            }
	        }
	      
	        return answer;
	    }
	
}
