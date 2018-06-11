package Dynamic;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int result =nums[0];
        int rMin = result;
        int rMax = result;
        for(int i=1;i<nums.length;i++) {
        	if(nums[i]>0) {
        		rMax = Math.max(rMax*nums[i], nums[i]);
        		rMin = Math.min(rMin*nums[i], nums[i]);
        	}else {
        		int k = rMax;
        		rMax = Math.max(rMin*nums[i], nums[i]);
        		rMin = Math.min(k*nums[i], nums[i]);
        	}
        	result = Math.max(result, rMax);
        }
        return result;
    }
}
