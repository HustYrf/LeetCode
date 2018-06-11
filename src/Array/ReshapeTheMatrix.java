package Array;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] result = new int[r][c];
        int rows=0,cols=0;
        if(nums.length==0||r*c!=nums.length*nums[0].length) return nums;
        for(int i=0;i<nums.length;i++) {
        	for(int j=0;j<nums[0].length;j++) {
        		result[rows][cols]=nums[i][j];
        		cols++;
        		if(cols==c) {
        			rows++;
        			cols=0;
        		}
        	}
        }
        return result;
    }
}
