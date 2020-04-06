package solution;

import java.util.Scanner;

public class OX {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        
	        String[] cases = new String[N];
	        for (int i = 0; i < N; i++) {
	            cases[i] = sc.next();
	        }
	        sc.close();
	         
	        int count, total;
	        for (String OXresult : cases) {
	            count = 0;
	            total = 0;
	            for (int i = 0; i < OXresult.length(); i++) {
	                if (OXresult.charAt(i) == 'O') {
	                    total += ++count;
	                } else {
	                    count = 0;
	                }
	            }
	            System.out.println(total);
	        }
	    }
}
