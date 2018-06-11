package String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public int romanToInt(String s) {
		int sum = 0;
		int prev = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			int n;
			switch (c) {
			case 'I':
				n = 1;
				break;
			case 'V':
				n = 5;
				break;
			case 'X':
				n = 10;
				break;
			case 'L':
				n = 50;
				break;
			case 'C':
				n = 100;
				break;
			case 'D':
				n = 500;
				break;
			case 'M':
				n = 1000;
				break;
			default:
				n = -1;
			}
			sum = n >= prev ? sum + n : sum - n;
			prev = n;
		}
		return sum;
	}
}
