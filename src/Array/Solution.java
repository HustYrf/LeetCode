package Array;

import java.util.Scanner;

/**
 *ÌâÄ¿ÃèÊö£º
 *Given a sorted array and a target value,
 *return the index if the target is found. If not, 
 *return the index where it would be if it were inserted in order.
 *You may assume no duplicates in the array.
 * @author yrf
 *
 */
class Solution {
    public static int searchInsert(int[] nums, int target) {
       int index=0;
       for(int i=0;i<nums.length;i++) {
    	   if(target<=nums[i]) {
    		   return i;
    	   }
       }
       return nums.length;
    }
    
    public static void main(String[] args) {
		int[] nums = new int[] {1,3,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.printf("input target:");
		int target = sc.nextInt();
		System.out.println(searchInsert(nums,target));	
	}
}
