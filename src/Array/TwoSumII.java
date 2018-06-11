package Array;

import java.util.Arrays;
import java.util.List;

public class TwoSumII {
	public static int[] twoSum(int[] numbers, int target) {
		int[] index = new int[2];
		int i = 0, j = 0;
		for (i = 0, j = numbers.length - 1; i <= j;) {
			if (numbers[i] + numbers[j] == target) {
				index[0] = i+1;
				index[1] = j+1;
				break;
			}else if(numbers[i] + numbers[j] < target) {
				i++;
			}else {
				j--;
			}
		}
		return index;
		
	}
	
	
	public static void main(String[] args) {
		int []numbers = new int[]{2,7,11,15};
		int[] index = twoSum(numbers,9);
		for(int i=0;i<index.length;i++) {
			System.out.print(index[i]);
		}
	}
}
