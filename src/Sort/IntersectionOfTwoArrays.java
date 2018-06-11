package Sort;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
          Set<Integer> s1 = new HashSet<>(nums1.length);
          Set<Integer> s2 = new HashSet<>(nums2.length);
          for(int i=0;i<nums1.length;i++) {
        	  s1.add(nums1[i]);
          }
          
          for(int j = 0 ;j<nums2.length;j++) {
        	  if(s1.contains(nums2[j])) s2.add(nums2[j]);
          }
          
          int[] result = new int[s2.size()];
          int count=0;
          for(Integer inte:s2) {
        	  result[count++]=inte.intValue();
          }
          return result;
    }
}
