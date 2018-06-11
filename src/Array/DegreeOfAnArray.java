package Array;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
	public int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int max = 1;
		for(int i=0;i<nums.length;i++) map.put(nums[i], 0);
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.get(nums[i]) + 1);
			max = Math.max(max, map.get(nums[i]));
		}
		if(max==1) return 1;
		int result = nums.length;
		for(int j = 0;j<nums.length;j++) {
			if(map.containsKey(nums[j])) {
				if(map.get(nums[j])==max) {
					int flag = nums.length;
					int index = nums.length-1;
					while(index>j) {
						if(nums[index]==nums[j])
						{
							flag = index-j+1;
							break;
						}
						index--;
					}
					result = Math.min(result, flag);
				}
				map.remove(nums[j]);
			}		
		}
		return result;
	}

	public static void main(String[] args) {
		DegreeOfAnArray d = new DegreeOfAnArray();
		int[] nums = new int[] { 1, 2 };
		int r = d.findShortestSubArray(nums);
		System.out.println(r);
	}
}
