package solution;

import java.util.*;

class programmers_knumber {

    public int[] solution(int[] array, int[][] commands) {
              int[] answer = new int[commands.length]; 
              int ans = 0;        
   
        for(int i=0;i<commands.length;i++)
        {
           int a = commands[i][0];
           int b = commands[i][1];
           int c = commands[i][2];
         
            int[] temp = new int[b - a + 1];
            
            int d =0;
            
            for(int j=a-1 ;j < b ; j++){                
             temp[d++]=array[j];
            }
             Arrays.sort(temp);                
             answer[ans++] = temp[c-1];
            }      
        return answer;
    }
}
