package String;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        StringBuilder sb = new StringBuilder(haystack);
        return sb.indexOf(needle);
    }
}
