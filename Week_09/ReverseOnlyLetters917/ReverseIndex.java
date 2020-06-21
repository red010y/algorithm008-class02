package ReverseOnlyLetters917;

/**
 * 思路：
 * 一个接一个输出 s 的所有字符。当遇到一个字母时，我们希望找到逆序遍历字符串的下一个字母。
 *
 * 所以我们这么做：维护一个指针 j 从后往前遍历字符串，当需要字母时就使用它。
 *
 */
public class ReverseIndex {
    public String reverseOnlyLetters(String S) {
        StringBuilder ans = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); ++i) {
            if (Character.isLetter(S.charAt(i))) {
                while (!Character.isLetter(S.charAt(j)))
                    j--;
                ans.append(S.charAt(j--));
            } else {
                ans.append(S.charAt(i));
            }
        }

        return ans.toString();
    }

}
