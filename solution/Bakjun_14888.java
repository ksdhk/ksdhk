package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

	public class Bakjun_14888 {
	    static int[] arr;// 숫자 배열
	    static int[] op;// 연산자 횟수를 저장할 배열
	    static ArrayList<Integer> list; // 최소값과 최대값을 찾기 위해 모든 값들을 저장해줌
	    static char[] MH; // 직관적으로 보기위해 (결과에는 영향 X)
	    static int N;
	    static int count = 0;
	 
	    public static void main(String[] args) throws Exception {
	       //Scanner sc = new Scanner(new FileInputStream("input.txt"));
	         Scanner sc = new Scanner(System.in);
	 
	        N = sc.nextInt();
	        arr = new int[N];
	        op = new int[4];
	        MH = new char[N]; // 직관적으로 보기위해 (결과에는 영향 X)
	 
	        list = new ArrayList<Integer>();
	 
	        for (int i = 0; i < N; i++) {
	            arr[i] = sc.nextInt();
	        }
	 
	        for (int i = 0; i < 4; i++) {
	            op[i] = sc.nextInt();
	        }
	 
	        DFS(1, arr[0]); // 출발 시작
	        Collections.sort(list);
	        System.out.println(list.get(list.size() - 1));
	        System.out.println(list.get(0));
	    }
	 
	    // x는 다음 숫자이고 sum은 그곳까지 갔을 때 합 이다.
	    static void DFS(int x, int sum) {
	        // ('+', '-', '*', '/') 연산자들을 한번씩 다 확인해야함 (DFS 전체탐색이니깐)
	        for (int i = 0; i < 4; i++) {
	            // 각각의 연산자마다 개수를 둬서 모두 0이면 쓸 연산자가 없으므로 통과
	            if (op[i] != 0) {
	                op[i]--; // 사용된 연산자를 하나씩 뺀다.
	                switch (i) {
	                case 0:
	                    MH[x - 1] = '+'; // 필요없지만 정보확인차
	                    DFS(x + 1, sum + arr[x]); // 다음 숫자 계산해야되니깐
	                    break;
	                case 1:
	                    MH[x - 1] = '-'; // 필요없지만 정보확인차
	                    DFS(x + 1, sum - arr[x]); // 다음 숫자 계산해야되니깐
	                    break;
	                case 2:
	                    MH[x - 1] = '*'; // 필요없지만 정보확인차
	                    DFS(x + 1, sum * arr[x]); // 다음 숫자 계산해야되니깐
	                    break;
	                case 3:
	                    MH[x - 1] = '/'; // 필요없지만 정보확인차
	                    DFS(x + 1, sum / arr[x]); // 다음 숫자 계산해야되니깐
	                    break;
	                }
	                MH[x - 1] = 0; // 필요없지만 정보확인차
	                op[i]++; // 사용이 끝났으면 다시 추가해준다.
	            }
	        }
	 
	        // 카운트가 입력값과 같아질 때 출력 (모든 숫자를 다 사용했을 경우)
	        if (x == N) {
	            for (int i = 0; i < N; i++) {
	             //   System.out.print(arr[i] + " ");
	               // System.out.print(MH[i] + " ");
	            }
	 
	            //System.out.println("= " + sum);
	            list.add(sum);
	        }
	    }

	}