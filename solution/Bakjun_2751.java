package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bakjun_2751{
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N =  Integer.parseInt(br.readLine());;
	    
	
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    for(int i=0;i<N;i++) {
	    list.add(Integer.parseInt(br.readLine()));
	    }
	    
	    list.sort(null);;
	    
	    for(int i=0;i<list.size();i++) {
	    System.out.println(list.get(i));
	    }	    
	  	 
	    
	}
}
