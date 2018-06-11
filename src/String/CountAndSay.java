package String;

public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1) return "1";
        else {
        	String s = countAndSay(n-1);
        	StringBuilder sb = new StringBuilder();
        	int length = s.length();
        	int index=0;
        	while(index<length) {
        		char ch = s.charAt(index++);
        		int count =1;
        		while(index<length&&ch==s.charAt(index)) {
        			count++;
        			index++;
        		}
        		sb.append(count).append(ch);
        	}
        	return sb.toString();
        }
    }
}
