package solution;

import java.util.*;

class Programmers_StringArray {

	    public String solution(String s) {
	        String[] array = s.split("");
	        Arrays.sort(array);        
	        Collections.reverse(Arrays.asList(array));
	        String answer = String.join("",array);
	        return answer;
	    }
	
}