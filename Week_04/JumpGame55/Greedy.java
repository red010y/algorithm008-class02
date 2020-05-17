package JumpGame55;

/**
 * 我们一开始在位置 00，可以跳跃的最大长度为 33，因此最远可以到达的位置被更新为 33；
 *
 * 我们遍历到位置 11，由于 1 \leq 31≤3，因此位置 11 可达，加上它可以跳跃的最大长度 22 得到 33，没有超过最远可以到达的位置；
 *
 * 位置 22、位置 33 同理，最远可以到达的位置不会被更新；
 *
 * 我们遍历到位置 44，由于 4 > 34>3，因此位置 44 不可达，我们也就不考虑它可以跳跃的最大长度了。
 */
public class Greedy {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
