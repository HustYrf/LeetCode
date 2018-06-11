package Array;

import java.util.Stack;

public class ReverseInteger {
	 public static int reverse(int x) {
	       int result = 0;
	       int i=0;
	       Stack<Integer> s  = new Stack<>();
	       while(x!=0) {
	    	   s.push(x%10);
	    	   x=x/10;
	       }
	       while(!s.isEmpty()) {
	    	   result+=s.pop()*Math.pow(10, i);
	    	   i++;
	       }
	       return (result <Integer.MIN_VALUE || result >Integer.MAX_VALUE) ? 0 : result;
	    }
    
    public static void main(String[] args) {
		System.out.println(reverse(-1563847412));
	}
}
