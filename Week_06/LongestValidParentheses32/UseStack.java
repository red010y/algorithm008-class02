package LongestValidParentheses32;

import java.util.Stack;

/**
 * 对于遇到的每个 \text{‘(’}‘(’ ，我们将它的下标放入栈中。
 * 对于遇到的每个 \text{‘)’}‘)’ ，我们弹出栈顶的元素并将当前元素的下标与弹出元素下标作差，
 * 得出当前有效括号字符串的长度。通过这种方法，我们继续计算有效子字符串的长度，并最终返回最长有效子字符串的长度。
 */
public class UseStack {
    public int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }
}
