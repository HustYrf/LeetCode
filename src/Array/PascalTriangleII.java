package Array;

import java.util.ArrayList;
import java.util.List;

/**Given a non-negative index k where k ¡Ü 33, 
 * return the kth index row of the Pascal's triangle.
 * Note that the row index starts from 0.
*/

public class PascalTriangleII {
	public static /*List<Integer>*/ void getRow(int rowIndex) {
		List<Integer> list = new ArrayList<>(rowIndex);
		for (int i = 0; i < rowIndex + 1; i++) {
			list.add(1);
			for (int j = i - 1; j > 0; j--) {
				list.set(j, list.get(j - 1) + list.get(j));
			}
		}
		for(Integer i:list)
			System.out.printf(i+",");
		//return list;
	}
	
	
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			getRow(i);    
			System.out.println();
		}
	}
   
}
