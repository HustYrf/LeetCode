package Array;
/**
 * Given a non-negative number represented as an array of digits,
 *  plus one to the number.
 *The digits are stored such that the 
 *most significant digit is at the head of the list.
 * @author yrf
 *
 */
public class PlusOne {
	public static int[] plusOne(int[] digits) {
		// int sum = 0;
		// for (int i = digits.length - 1; i >= 0; i--) {
		// sum += digits[i] * Math.pow(10.0, (double) (digits.length - 1 - i));
		// }
		// sum += 1;
		// int flag = sum;
		// int[] result;
		// int length = 0;
		// while (flag > 0) {
		// length++;
		// flag = flag / 10;
		// }
		// result = new int[length];
		// for (int j = length - 1; j >= 0; j--) {
		// result[j] = sum % 10;
		// sum = sum / 10;
		// }
		// return result;
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;

		return newNumber;
	}

	public static void main(String[] args) {
		int[] digits = new int[] { 1, 2, 3, 9 };
		System.out.println(plusOne(digits));
	}
}
