package StudentAttendanceRecordII552;

/**
 * 计算 f[i]f[i] 都需要使用递归函数，直到走到字符串最开始的位置。
 * 如果我们使用记录下来的 f[j]f[j] 去更新 f[i]f[i]，我们可以节省非常大量的计算时间，
 * 递推公式为 f[i] = 2f[i-1] + f[i-4]f[i]=2f[i−1]+f[i−4]。
 */
public class DP {
    long M = 1000000007;
    public int checkRecord(int n) {
        long[] f = new long[n <= 5 ? 6 : n + 1];
        f[0] = 1;
        f[1] = 2;
        f[2] = 4;
        f[3] = 7;
        for (int i = 4; i <= n; i++)
            f[i] = ((2 * f[i - 1]) % M + (M - f[i - 4])) % M;
        long sum = f[n];
        for (int i = 1; i <= n; i++) {
            sum += (f[i - 1] * f[n - i]) % M;
        }
        return (int)(sum % M);
    }
}
