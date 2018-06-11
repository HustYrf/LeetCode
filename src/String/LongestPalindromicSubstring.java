package String;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int length = s.length();
        String result = null;
        boolean[][] dp = new boolean[length][length];
        int max =1;
        for(int d=0;d<length;d++) {
        	for(int i=0;i<length-d;i++) {
        		int j = i+d;
        		if(s.charAt(i)==s.charAt(j)) {
        			if(d==0||d==1) {
        				dp[i][j]=true;
        			}else {
        				dp[i][j]=dp[i+1][j-1];
        			}
        			if(dp[i][j]==true) {
        				max= Math.max(max, d+1);
        			}
        		}
        	}
        }
        for(int index=0;index<=length-max;index++) {
        	int j=index+max-1;
        	if(dp[index][j]==true) {
        		result=s.substring(index, j+1);
        		break;
        	}
        }
        return result;  
    }
    
    public static void main(String[] args) {
    	LongestPalindromicSubstring l = new LongestPalindromicSubstring();
    	System.out.println(l.longestPalindrome("babad"));
	}
}
