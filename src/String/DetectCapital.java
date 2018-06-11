package String;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        StringBuilder sb1 = new StringBuilder(word.toLowerCase());
        StringBuilder sb3 = new StringBuilder(word.toUpperCase());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(word.substring(0, 1).toUpperCase()).append(word.substring(1,word.length()).toLowerCase());
        if(sb1.toString().equals(word)||sb2.toString().equals(word)||sb3.toString().equals(word)) return true;
        return false;
    }
}
