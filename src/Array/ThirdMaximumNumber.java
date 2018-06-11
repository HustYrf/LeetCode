package Array;

public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		// int max=Integer.MIN_VALUE;
		// int two_max=Integer.MIN_VALUE;
		// int three_max=Integer.MIN_VALUE;
		// for(int i=0;i<nums.length;i++) {
		// if(nums[i]>max) {
		// max=nums[i];
		// }
		// }
		// for(int i=0;i<nums.length;i++) {
		// if(nums[i]==max)
		// nums[i]=Integer.MIN_VALUE;
		// }
		//
		// for(int w=0;w<nums.length;w++) {
		// if(nums[w]>two_max) {
		// two_max=nums[w];
		// }
		// }
		// if(two_max==Integer.MIN_VALUE) return max;
		// for(int i=0;i<nums.length;i++) {
		// if(nums[i]==two_max)
		// nums[i]=Integer.MIN_VALUE;
		// }
		// for(int w=0;w<nums.length;w++) {
		// if(nums[w]>three_max) {
		// three_max=nums[w];
		// }
		// }
		//
		// return three_max==Integer.MIN_VALUE?max:three_max;
		Integer max1 = null;
		Integer max2 = null;
		Integer max3 = null;

		for (Integer n : nums) {
			if (n.equals(max1) || n.equals(max2) || n.equals(max3))
				continue;
			if (max1 == null || max1 < n) {
				max3 = max2;
				max2 = max1;
				max1 = n;
			} else if (max2 == null || n > max2) {
				max3 = max2;
				max2 = n;
			} else if (max3 == null || n > max3) {
				max3 = n;
			}

		}
		return max3 == null ? max1 : max3;

		// Integer max1 = null;
		// Integer max2 = null;
		// Integer max3 = null;
		// for (Integer n : nums) {
		// if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
		// if (max1 == null || n > max1) {
		// max3 = max2;
		// max2 = max1;
		// max1 = n;
		// } else if (max2 == null || n > max2) {
		// max3 = max2;
		// max2 = n;
		// } else if (max3 == null || n > max3) {
		// max3 = n;
		// }
		// }
		// return max3 == null ? max1 : max3;

	}
}
