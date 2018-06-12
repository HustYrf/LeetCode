package Heap;

import java.util.*;
//效率不高，看有没有比较好的其它方法
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.keySet().contains(nums[i])) continue;
            else map.put(nums[i], 0);
        }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.get(nums[i]) + 1);
        }


        Iterator<Integer> iterator = map.values().iterator();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        while (iterator.hasNext()) {
            queue.add(iterator.next());
            if (queue.size() > k) queue.poll();
        }
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        while (queue.size() != 0) {
            Integer flag = queue.poll();
            for (int i = 0; i < nums.length; i++) {
                if (map.get(nums[i]) == flag) {
                    set.add(nums[i]);
                }
            }
        }
        Iterator<Integer> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            result.add(setIterator.next());
        }

        return result;
    }


    public static void main(String args[]) {
        TopKFrequentElements t = new TopKFrequentElements();
        int[] nums= new int[]{4,1,-1,2,-1,2,3,3,2,1,1,1};
        List<Integer> result = t.topKFrequent(nums,2);
        Iterator<Integer> iterator = result.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }

    }
}
