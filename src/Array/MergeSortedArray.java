package Array;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
//        Set<Integer> s = new TreeSet<>();
//        for(int i=0;i<nums1.length;i++) {
//        	s.add(Integer.valueOf(nums1[i]));
//        }
//        for(int i=0;i<nums2.length;i++) {
//        	s.add(Integer.valueOf(nums2[i]));
//        }
//        int k = 0;
//        Iterator<Integer> iterator= s.iterator();
//        while(iterator.hasNext()) {
//        	nums1[k++]=iterator.next().intValue();
//        }
		int i = m-1;int j = n-1; int k=m+n-1;
		while(i>=0&&j>=0) nums1[k--]=nums1[i]>=nums2[j]?nums1[i--]:nums2[j--];
        while(j>=0) nums1[k--]=nums2[j--];
	}
}
