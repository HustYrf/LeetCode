package Array;

import java.util.Arrays;
/**
 *       int expectedSum = nums.length*(nums.length + 1)/2;
 *       int actualSum = 0;
 *       for (int num : nums) actualSum += num;
 *       return expectedSum - actualSum;
 * @author yrf
 *
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
    	int[] result  = new int[nums.length+1];
    	int k=0;
        for(int i=0;i<nums.length;i++) {
        	result[nums[i]]=nums[i];
        }
        for(int j=0;j<nums.length+1;j++) {
        	if(result[j]!=j) {
        	    k=j;
        		break;
        	}
        }
        return k;
    }
}
