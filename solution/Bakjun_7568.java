package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bakjun_7568{
	 public static void main(String[] args)    {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt(); 
   
     ArrayList<Map> list = new ArrayList();
     
     for(int i=0;i<T;i++) {
     Map<String,Object> temp = new HashMap();
    	 
      int weight = sc.nextInt();
      int height = sc.nextInt();
  
      temp.put("weight", weight);
      temp.put("height", height);
      
      
      
      list.add(temp);
     }
   String answer = "";
     for(int i=0;i<list.size();i++) {    
    	  int rank = 0;
    	 for(int j=0;j<list.size();j++) {
    		 
    	if(Integer.parseInt(list.get(i).get("weight").toString()) < Integer.parseInt(list.get(j).get("weight").toString()) 
          && Integer.parseInt(list.get(i).get("height").toString()) < Integer.parseInt(list.get(j).get("height").toString())) {
    		rank++;
    	};

    	 }
    	 answer=answer+(rank+1)+" ";
    	  
     }
     System.out.println(answer);	
     sc.close();
 
	 }

}