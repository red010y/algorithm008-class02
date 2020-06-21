package ValidPalindromeII680;

/**
 * 定义左右指针，初始时分别指向字符串的第一个字符和最后一个字符，
 * 每次判断左右指针指向的字符是否相同，如果不相同，则不是回文串；
 * 如果相同，则将左右指针都往中间移动一位，直到左右指针相遇，则字符串是回文串。
 */
public class Greedy {
    public boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char c1 = s.charAt(low), c2 = s.charAt(high);
            if (c1 == c2) {
                low++;
                high--;
            } else {
                boolean flag1 = true, flag2 = true;
                for (int i = low, j = high - 1; i < j; i++, j--) {
                    char c3 = s.charAt(i), c4 = s.charAt(j);
                    if (c3 != c4) {
                        flag1 = false;
                        break;
                    }
                }
                for (int i = low + 1, j = high; i < j; i++, j--) {
                    char c3 = s.charAt(i), c4 = s.charAt(j);
                    if (c3 != c4) {
                        flag2 = false;
                        break;
                    }
                }
                return flag1 || flag2;
            }
        }
        return true;
    }

}
