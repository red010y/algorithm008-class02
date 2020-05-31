
package PalindromicSubstrings647;

public class Brute {
    public int countSubstrings(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 2; i <= s.length(); i++) {
            for (int j = 0; j + i - 1 < s.length(); j++)
                if (isPalindrome(chars, j, j + i - 1))
                    result++;
        }
        return result + s.length();
    }

    private boolean isPalindrome(char[] chars, int start, int end) {
        for (int i = start, j = end; j > i; i++, j--) {
            if (chars[i] != chars[j])
                return false;
        }
        return true;
    }
}
