package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class ValidParentheses {
    public boolean isValid(String s) {
    	if(s.equals("")) return true;
        s=s.trim();
        if(s.length()%2==1) return false;
        boolean result = false;
        int j=0;
        Map<Character,Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        while(j<s.length()) {
            if(map.keySet().contains(s.charAt(j))) {
            	stack.push(s.charAt(j));
            }else {
            	result = (!stack.isEmpty())&&(map.get(stack.pop())==s.charAt(j));
                if(result==false) break;
            }
            j++;
        }
         return result&&stack.isEmpty();
    }
    
    public static void main(String[] args) {
    	ValidParentheses v	= new ValidParentheses();
    	System.out.println(v.isValid(new String("")));
	}
}
