package Array;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
    	int [] copyNum = new int[nums.length];
    
    	for(int k=0;k<nums.length;k++) {
    		copyNum[k]=nums[k];
    	}
    	
    	//int [] copyNum = nums.clone();
    	int count=0;
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<nums.length) {
        	if(copyNum[i]==nums[i]) 
        		i++;
        	else break;
        }
        while(j>=0) {
        	if(copyNum[j]==nums[j]) j--;
        	else break;
        }
        count = j-i+1;
        return i>j?0:count;
    }
}
