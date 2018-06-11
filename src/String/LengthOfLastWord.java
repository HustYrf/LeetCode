package String;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        int index = s.length()-1;
        char ch = ' ';
        while(index>=0) {
        	if(s.charAt(index)!=ch) {
        		count++;
        		index--;
        	}else break;
        }
        
        return count==s.length()?0:count;
    }
}
