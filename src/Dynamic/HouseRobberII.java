package Dynamic;

public class HouseRobberII {
	public int rob(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		return Math.max(subMax(nums, 0, nums.length - 2), subMax(nums, 1, nums.length - 1));
	}

	public int subMax(int nums[], int start, int end) {
		int length = end - start + 1;
		int[] dp = new int[length + 1];
		dp[0] = 0;
		dp[1] = nums[start];

		for (int i = 2; i <= length; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[start+i-1]);
		}

		return dp[length];
	}
}
