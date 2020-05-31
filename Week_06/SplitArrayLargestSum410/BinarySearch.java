package SplitArrayLargestSum410;

/**
 * 我们可以用二分搜索来找到 x0。每次循环，我们让 mid = (left + right) / 2，
 * 如果 F(mid) 为假，那么我们接下来就去搜索 [mid + 1, right] 区间；如果 F(mid) 为真，
 * 那么我们接下来就去搜索 [left, mid - 1] 区间。
 */
public class BinarySearch {
    public int splitArray(int[] nums, int m) {
        long l = 0;
        long r = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            r += nums[i];
            if (l < nums[i]) {
                l = nums[i];
            }
        }
        long ans = r;
        while (l <= r) {
            long mid = (l + r) >> 1;
            long sum = 0;
            int cnt = 1;
            for (int i = 0; i < n; i++) {
                if (sum + nums[i] > mid) {
                    cnt ++;
                    sum = nums[i];
                } else {
                    sum += nums[i];
                }
            }
            if (cnt <= m) {
                ans = Math.min(ans, mid);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int)ans;
    }
}
