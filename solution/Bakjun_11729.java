package solution;

import java.util.Scanner;

public class Bakjun_11729 {
	public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)    {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt(); sc.close();
     hanoi(N, 1, 2, 3);
     System.out.println((int)Math.pow(2, N)-1);
     System.out.println(sb); }
    
    public static void hanoi(int n, int from, int by, int to)     {
       if(n == 1) { sb.append(from + " " + to + "\n"); return ; } 
     hanoi(n-1, from, to, by); sb.append(from + " " + to + "\n"); 
     hanoi(n-1, by, from, to);
    }


}