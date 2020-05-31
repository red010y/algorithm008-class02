package BurstBalloons312;

/**
 * 这道题看起来最直接的做法就是暴力所有可能的扎破气球的顺序，
 * 但这个数量级很大，有 N \times (N - 1) \times (N - 2) \times ... \times 1N×(N−1)×(N−2)×...×1 种可能，
 * 时间复杂度为 O(N!)O(N!)。这种最直接的暴力会有很多重复计算，比如有四个气球，你先扎破第一个再扎破第二个，
 * 跟你先扎破第二个在扎破第一个，最后都是剩下第三个和第四个气球，
 *  因此对于剩余第三个和第四个气球这种情况只需要计算一次就可以了。
 */
public class DP {
    public int maxCoins(int[] nums) {

        // reframe the problem
        int n = nums.length + 2;
        int[] new_nums = new int[n];

        for(int i = 0; i < nums.length; i++){
            new_nums[i+1] = nums[i];
        }

        new_nums[0] = new_nums[n - 1] = 1;

        // cache the results of dp
        int[][] memo = new int[n][n];

        // find the maximum number of coins obtained from adding all balloons from (0, len(nums) - 1)
        return dp(memo, new_nums, 0, n - 1);
    }

    public int dp(int[][] memo, int[] nums, int left, int right) {
        // no more balloons can be added
        if (left + 1 == right) return 0;

        // we've already seen this, return from cache
        if (memo[left][right] > 0) return memo[left][right];

        // add each balloon on the interval and return the maximum score
        int ans = 0;
        for (int i = left + 1; i < right; ++i)
            ans = Math.max(ans, nums[left] * nums[i] * nums[right]
                    + dp(memo, nums, left, i) + dp(memo, nums, i, right));
        // add to the cache
        memo[left][right] = ans;
        return ans;
    }
}
