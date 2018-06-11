package String;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        String flag = "aeiou";
        int i=0,j=s.length()-1;
        String change = null;
        StringBuilder sb = new StringBuilder(s);
        while(i<j) {
            while((i<j)&&(!flag.contains(s.substring(i, i+1).toLowerCase()))) i++;
        	while((j>i)&&(!flag.contains(s.substring(j,j+1).toLowerCase()))) j--;
            change = s.substring(i,i+1);
            sb.replace(i, i+1, s.substring(j,j+1));
            sb.replace(j, j+1, change);
            i++;j--;
        	}
        return sb.toString();
        }
    }

