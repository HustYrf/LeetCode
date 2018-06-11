package Sort;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
    	if(s.length()!=t.length()) return false;
        int[] dp = new int[26];
        for(int i=0;i<s.length();i++) {
        	dp[s.charAt(i)-'a']++;
        }
        for(int j=0;j<s.length();j++) {
        	if(--dp[t.charAt(j)-'a']<0)
        		return false;
        }
        return true;
    }
}
