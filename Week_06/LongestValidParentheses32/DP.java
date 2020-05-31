package LongestValidParentheses32;

/**
 * 这个问题可以通过动态规划解决。我们定义一个 \text{dp}dp 数组，
 * 其中第 ii 个元素表示以下标为 ii 的字符结尾的最长有效子字符串的长度。
 * 我们将 \text{dp}dp 数组全部初始化为 0 。
 * 现在，很明显有效的子字符串一定以 \text{‘)’}‘)’ 结尾。
 * 这进一步可以得出结论：以 \text{‘(’}‘(’ 结尾的子字符串对应的 \text{dp}dp 数组位置上的值必定为 0 。
 * 所以说我们只需要更新 \text{‘)’}‘)’ 在 \text{dp}dp 数组中对应位置的值。
 */
public class DP {
    public int longestValidParentheses(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }
}
