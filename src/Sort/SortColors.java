package Sort;

public class SortColors {
    public void sortColors(int[] nums) {
    	int two =0;
    	int one =0;
    	int zero=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==0) {
        		zero++;
        	}else if(nums[i]==1) {
        		one++;
        	}else if(nums[i]==2) {
        		two++;
        	}
        }
        for(int j=0;j<zero;j++) nums[j]=0;
        for(int j = zero;j<zero+one;j++) nums[j]=1;
        for(int j=zero+one;j<nums.length;j++) nums[j]=2;
        
   
        
        
    }
}
