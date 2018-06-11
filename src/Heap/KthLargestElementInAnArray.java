package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
//        Arrays.sort(nums);
//        return nums[nums.length-k];
        //还可以设置一个大小位k的最小堆
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            heap.add(nums[i]);
            if(heap.size()>k) heap.poll();
        }
        return heap.poll();
    }
}
