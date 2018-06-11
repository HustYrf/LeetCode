package Dynamic;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
    	if(triangle==null||triangle.size()==0) return 0;
    	if(triangle.size()==1) return triangle.get(0).get(0);
    	int n = triangle.size();
    	int[] dp = new int[n+1];
    	dp[0]=triangle.get(0).get(0);
    	for(int i=1;i<triangle.size();i++) {
    		dp[i]=dp[i-1]+triangle.get(i).get(i);
    		for(int j=i-1;j>=1;j--) {
    			dp[j]=Math.min(dp[j], dp[j-1])+triangle.get(i).get(j);
    		}
    		dp[0]=dp[0]+triangle.get(i).get(0);
    	}
    	int min=dp[0];
    	for(int k=1;k<n;k++) {
    		min=Math.min(min, dp[k]);
    	}
    	
       return min;
      
    }
}
