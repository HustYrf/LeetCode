package Array;

public class RotateArray {
	public static void rotate(int[] nums, int k) {
		int[] nums_copy = new int[nums.length];
		int count = 0;
        if(k<=nums.length) {
		for (int i = nums.length - k; i < nums.length; i++) {
			nums_copy[count] = nums[i];
			count++;
		}

		for (int i = 0; i < nums.length - k; i++) {
			nums_copy[count] = nums[i];
			count++;
		}
		for(int i=0;i<nums_copy.length;i++)
		//System.out.print(nums_copy[i]+",");
			nums[i]=nums_copy[i];
        }
	}

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6,7};
		rotate(nums,3);
	}
}
