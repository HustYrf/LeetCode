package Array;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int i = 0, j = nums.length - 1;

		while (i < j) {
			while (nums[j] == val && i < j)
				j--;
			while (nums[i] != val && i < j)
				i++;
			if (i != j) {
				nums[i] = nums[j];
				nums[j] = val;
			}
		}

		if (i == j) {
			if (nums[i] == val) {
				nums = null;
				return i;
			} else {
				return i + 1;
			}
		}

		return j + 1;
	}
}
