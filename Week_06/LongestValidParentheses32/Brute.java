package LongestValidParentheses32;

import java.util.Stack;

/**
 * 每当我们遇到一个 \text{‘(’}‘(’ ，我们把它放在栈顶。对于遇到的每个 \text{‘)’}‘)’ ，
 * 我们从栈中弹出一个 \text{‘(’}‘(’ ，如果栈顶没有 \text{‘(’}‘(’，
 * 或者遍历完整个子字符串后栈中仍然有元素，那么该子字符串是无效的。
 * 这种方法中，我们对每个偶数长度的子字符串都进行判断，并保存目前为止找到的最长的有效子字符串的长度。
 *
 */
public class Brute {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (!stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }
    public int longestValidParentheses(String s) {
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j+=2) {
                if (isValid(s.substring(i, j))) {
                    maxlen = Math.max(maxlen, j - i);
                }
            }
        }
        return maxlen;
    }
}
