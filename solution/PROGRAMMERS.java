package solution;

public class PROGRAMMERS {
	    public int[] solution(int[] answers) {
	        int[] a = {1,2,3,4,5};
	        int[] b = {2,1,2,3,2,4,2,5};
	        int[] c = {3,3,1,1,2,2,4,4,5,5};
	        int AA = 0;
	        int BB = 0;
	        int CC = 0;
	        for(int i=0;i<answers.length;i++){
	            if(answers[i]==a[i%5]){AA++;};
	            if(answers[i]==b[i%8]){BB++;};
	            if(answers[i]==c[i%10]){CC++;};
	        }
	    	int max1 = Math.max(AA,BB);
		    int max2 = Math.max(BB,CC);
		    int max = Math.max(max1, max2);
	        int answer[] = new int[3];
	       int anslength=0;
	        if(max==AA){
	          answer[0]=1;
	            anslength++;
	        }  if(max==BB){
	            anslength++;
	          answer[1]=2;
	        }  if(max==CC){
	          answer[2]=3;
	            anslength++;
	        }
	          int i = 0;
	        
	    int ans[]=new int[anslength];

			   if(max==AA) {
				   ans[i]=1;
	               i++;
			    }else {	  	
	           };
			    if(max==BB){
				   ans[i]=2;
			    	i++;
			    }else {		    	
			    };

			   if(max==CC) {
				   ans[i]=3;
			    	i++;
			    }else {		    	
			    };
	        
	        return ans;
	    }
	}