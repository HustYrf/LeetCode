package String;

import java.util.Arrays;
import java.util.HashSet;

public class GoatLatin {
	 public String toGoatLatin(String S) {
	        if (S.length() == 0) return S;
	        Character[] vowelsList = new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
	        HashSet<Character> vows = new HashSet(Arrays.asList(vowelsList));
	        String[] words = S.split(" ");
	        StringBuilder res = new StringBuilder();
	        StringBuilder a = new StringBuilder();
	        for (int i = 0; i < words.length; i++) {
	            a.append("a");
	            if (vows.contains(words[i].charAt(0))) {
	                res.append(words[i]);   
	            } else {
	                res.append(words[i].substring(1));
	                res.append(words[i].charAt(0));
	            }
	            res.append("ma");
	            res.append(a.toString());
	            res.append(" ");
	        }
	        res.setLength(res.length() - 1);
	        return res.toString();
	 }
}
