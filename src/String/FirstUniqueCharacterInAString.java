package String;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] num = new int[26];
        for(int i=0;i<s.length();i++) {
        	num[s.charAt(i)-'a']++;
        }
        for(int j=0;j<s.length();j++) {
        	if(num[s.charAt(j)-'a']==1) return j;
        }
        return -1;
    }
}
