package Dynamic;

public class UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       int m=obstacleGrid.length;//行数
       int n=obstacleGrid[0].length;//列数
       int[][] dp = new int[m][n];
       if(obstacleGrid.length==0||obstacleGrid[0][0]==1) return 0;
       dp[0][0]=1;
       int i=1;
       while(i<n) {
    	   if(obstacleGrid[0][i]==0) { dp[0][i]=1;i++;continue;}
    	   if(obstacleGrid[0][i]==1) {
    		   for(int j=i;j<n;j++) {
    			   dp[0][j]=0;
    		   }
    		   break;
    	   }
       }
      int k=1;
      while(k<m) {
    	  if(obstacleGrid[k][0]==0) {dp[k][0]=1;k++;continue;}
    	  if(obstacleGrid[k][0]==1) {
    		  for(int l=k;l<m;l++) {
    			  dp[l][0]=0;
    		  }
    	  }
    	  break;
      }
      for(int x=1;x<m;x++) {
      	for(int y=1;y<n;y++) {
      		if(obstacleGrid[x][y]==1) {dp[x][y]=0;continue;}
      		else dp[x][y]=dp[x-1][y]+dp[x][y-1];
      	}
      }
       return dp[m-1][n-1];
    }
}
