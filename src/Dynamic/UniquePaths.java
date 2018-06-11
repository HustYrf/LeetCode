package Dynamic;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int [][]a = new int[m][n];
        for(int i=0;i<m;i++) a[i][0]=1;
        for(int j=0;j<n;j++) a[0][j]=1;
        for(int k=1;k<m;k++) {
        	for(int l=1;l<n;l++) {
        		a[k][l]=a[k-1][l]+a[k][l-1];
        	}
        }
        return a[m-1][n-1];
    }
}
