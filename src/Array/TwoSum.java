package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	 public int[] twoSum(int[] nums, int target) {
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        int [] result = new int[2];
	        for(int i=0;i<nums.length;i++) {
	        	map.put(target-nums[i],i);
	        }
	        for(int j=0;j<nums.length;j++) {
	        	if(map.containsKey(nums[j])&&j!=map.get(nums[j])) {
	        		result[0]=j;
	        		result[1]=map.get(nums[j]);
	        		break;
	        	}
	        }
	        return result;
	    }
}
