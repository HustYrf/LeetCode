package Math;

public class PalindromNumber {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        int num = x;
        while(x > 0) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return num == revertedNumber;
    }
}
