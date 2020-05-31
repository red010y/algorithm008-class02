package StudentAttendanceRecordII552;

/**
 * 首先，假设此问题只要考虑字符 LL 和 PP，也就是说字符串只包含字母 LL 和 PP。
 * AA 产生的影响稍后我们再考虑。
 * 为了得到这样的关系，我们假设 f[n]f[n] 表示长度为 nn 的可奖励字符串的数目（只包含字母 LL 和 PP)。
 * 然后，我们可以利用小于 nn 的字符串数目，算出 f[n]f[n]。下图说明了计算的过程：
 */
public class Recursive {
    public class Solution {
        int count,M=1000000007;
        public int checkRecord(int n) {
            count = 0;
            gen("", n);
            return count;
        }
        public void gen(String s, int n) {
            if (n == 0 && checkRecord(s))
                count=(count+1)%M;
            else if (n > 0) {
                gen(s + "A", n - 1);
                gen(s + "P", n - 1);
                gen(s + "L", n - 1);
            }
        }
        public boolean checkRecord(String s) {
            int count = 0;
            for (int i = 0; i < s.length() && count < 2; i++)
                if (s.charAt(i) == 'A')
                    count++;
            return s.length() > 0 && count < 2 && s.indexOf("LLL") < 0;
        }
    }
}
