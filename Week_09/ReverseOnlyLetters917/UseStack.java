package ReverseOnlyLetters917;

import java.util.Stack;

/**
 * 思路：
 * 将 s 中的所有字母单独存入栈中，所以出栈等价于对字母反序操作。（或者，可以用数组存储字母并反序数组。）
 *
 * 然后，遍历 s 的所有字符，如果是字母我们就选择栈顶元素输出。
 *
 */
public class UseStack {
    public String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack();
        for (char c: S.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }

        return ans.toString();
    }

}
