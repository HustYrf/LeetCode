package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KdiffPairsinanArray {
    public int findPairs(int[] nums, int k) {
        int count =0;
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(Math.abs(nums[i]-nums[j])==k) {
        			map.put(Math.min(nums[i], nums[j]), Math.max(nums[i], nums[j]));
        		}
        	}
        }
        count = map.size();
        return count;
       
    }
}
