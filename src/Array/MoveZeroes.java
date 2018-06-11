package Array;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int i = 0, j = 0;
		for (int k = 0; k < nums.length; k++) {
			if (nums[k] == 0) {
				i = k;
				j = i + 1;
				if (j == nums.length)
					break;
				// while(nums[j]!=0&&j<nums.length) j++;
				for (int m = j; m < nums.length; m++) {
					if (nums[m] != 0) {
						j = m;
						break;
					}
				}
				nums[k] = nums[j];
				nums[j] = 0;
			}

		}
//		int j = 0;
//		int n = nums.length;
//		for (int i = 0; i < n; i++)
//			if (nums[i] != 0)
//				nums[j++] = nums[i];
//		for (; j < n; j++)
//			nums[j] = 0;
	}
}
