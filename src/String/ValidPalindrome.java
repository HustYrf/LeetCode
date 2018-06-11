package String;
//验证回文串
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        boolean result = true;
        s=s.trim();
        int index =0;
        StringBuilder sb = new StringBuilder(s.length());
        while(index<s.length()) {
        	char ch = s.charAt(index);
        	if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9') sb.append(ch);
        	index++;
        }
        s = sb.toString().toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j) {
        	if(s.charAt(i)!=s.charAt(j)) {result=false;break;}
        	i++;j--;
        }
        return result;
    }
    public static void main(String[] args) {
    	ValidPalindrome v	= new ValidPalindrome();
        boolean b = v.isPalindrome("race a car");
        System.out.println(b);
    }
}
