public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = x;

        int flipped = 0;

        while (temp > 0) {
            flipped = flipped * 10 + temp % 10;
            temp /= 10;
        }
        if (flipped == x) return true;
        return false;
    }
}
