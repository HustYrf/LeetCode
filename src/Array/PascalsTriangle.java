package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int index = 1; index <= numRows; index++) {
			List<Integer> l1 = new ArrayList<>();
			for (int i = 0; i < index; i++) {
				l1.add(1);
				for (int j = i - 1; j > 0; j--) {
					l1.set(j, l1.get(j - 1) + l1.get(j));
				}
			}
			result.add(l1);
		}
		return result;
	}
}
