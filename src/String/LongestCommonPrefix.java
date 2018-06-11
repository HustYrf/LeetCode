package String;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 0) return result;
        String stringFlag = strs[0];
        result=stringFlag;
        for(int i=1;i<strs.length;i++) {
        	String subMax = "";
        	for(int j=0;j<strs[i].length()&&j<stringFlag.length();j++) {
        		if(stringFlag.substring(j, j+1).equals(strs[i].substring(j, j+1))) {
                    subMax = subMax+stringFlag.substring(j, j+1);
                    continue;
        		}
        		if(!stringFlag.substring(j, j+1).equals(strs[i].substring(j, j+1))) break;
        	}
            if(subMax.length()<=result.length()) result=subMax;
        }
        return result;
    }
    
    public static void main(String[] args) {
    	LongestCommonPrefix l = new LongestCommonPrefix();
    	

	}
}
