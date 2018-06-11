package Dynamic;

public class HouseRobber {
	public int rob(int[] nums) {
		int max = 0;
		if (nums.length == 0 || nums == null) {
			return max;
		}
		int[] result = new int[nums.length];
		result[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(i==1) {
			result[1]=nums[1];
			}else if(i==2) {
				result[2]=nums[2]+nums[0];
			}else {
				result[i]=Math.max(result[i-2], result[i-3])+nums[i];
			}
	
		}
       for(int j=0;j<result.length;j++) {
    	   max=Math.max(result[j], max);
       }
       return max;
	}
}
