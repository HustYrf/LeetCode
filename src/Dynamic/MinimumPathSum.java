package Dynamic;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
    	int i=grid.length;
    	int j=grid[0].length;
        int[][] dp = new int[i][j];
        dp[0][0]=grid[0][0];
        for(int k = 1;k<j;k++) {
        	dp[0][k]=dp[0][k-1]+grid[0][k];
        }
        for(int l = 1;l<i;l++) {
        	dp[l][0]=dp[l-1][0]+grid[l][0];
        }
        for(int x=1;x<i;x++) {
        	for(int y=1;y<j;y++) {
        		dp[x][y]=Math.min(dp[x][y-1], dp[x-1][y])+grid[x][y];
        	}
        }
        return dp[i-1][j-1];
    }
}
