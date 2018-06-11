package String;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
           int j=0;
           int i=0;
           while(j<magazine.length()) {
        	   while((j<magazine.length())&&(i<ransomNote.length())&&(magazine.substring(j, j+1).equals(ransomNote.substring(i, i+1)))){
        		   i++;
        		   j++;
        	   }
        	   j++;
           }
           return i==ransomNote.length();
    }
}
