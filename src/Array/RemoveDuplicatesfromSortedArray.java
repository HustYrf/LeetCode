package Array;

public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		int j=1,i=0;
		while(j<nums.length) {
			if(nums[i]!=nums[j]) {
				i++;
				nums[i]=nums[j];
				j++;
			}else {
				j++;
			}
		}
		return i;
	}
}
