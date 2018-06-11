package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        while(i<nums.length) {
        	count+=nums[i];
        	i+=2;
        }
        return count;
    }
}
