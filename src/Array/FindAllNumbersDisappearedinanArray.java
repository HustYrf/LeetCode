package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindAllNumbersDisappearedinanArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
         Set<Integer> s =  new TreeSet();
         List<Integer> l = new ArrayList<>();
         for(int i=0;i<nums.length;i++) {
        	 s.add(nums[i]);
        	 }
         for(int j=0;j<nums.length;j++) {
        	 if(s.contains(j)) continue;
        	 l.add(j);
         }
         return l;
	}
}
