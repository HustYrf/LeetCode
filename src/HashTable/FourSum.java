package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//[-3,-1,0,2,4,5]
public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		int[][] dp = new int[nums.length][nums.length];
        Set<List<Integer>> set = new HashSet<>();
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length<4) return result;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				dp[i][j] = nums[i] + nums[j];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			int index1 = i + 1;
			while (index1 < nums.length) {
				for (int j = i + 1; j < nums.length; j++) {
					int index2 = j + 1;
					while ((index2 < nums.length)&&(j!=index1&&i!=j&&index1!=index2)) {
						if (dp[i][index1] + dp[j][index2] == target) {
							List<Integer> l = new ArrayList<Integer>();
							int[] nums1 = new int[4];
							nums1[0] = nums[i];
							nums1[1] = nums[index1];
						    nums1[2] = nums[j];
						    nums1[3] = nums[index2];
						    Arrays.sort(nums1);						    
							l.add(nums1[0]);
							l.add(nums1[1]);
							l.add(nums1[2]);
							l.add(nums1[3]);
							set.add(l);
						}
						index2++;
					}
				}
				index1++;
			}
		}
		for(List<Integer> list:set) {
			result.add(list);
		}
        return result;
	}
}
