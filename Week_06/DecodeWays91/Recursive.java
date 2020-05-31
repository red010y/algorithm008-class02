package DecodeWays91;

/**
 * 首先如果为7。很显然是1种7->G
 * 如果为67。很显然还是1种67->FG
 * 如果为067。结果为0。
 * 如果为2067。 结果为numDecodings（20 67）+ numDecodings（2 067）= numDecodings（20 67）->TFG
 * 如果为22067。 结果为numDecodings（2 2067）+ numDecodings（22 067）= numDecodings（2 2067）->BTF
 */
public class Recursive {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        return digui(s, 0);
    }

    //递归的套路，加一个index控制递归的层次
    private int digui(String s, int start) {
        //递归的第一步，应该是加终止条件，避免死循环。
        if (s.length() == start) {
            return 1;
        }
        //以0位开始的数是不存在的
        if (s.charAt(start) == '0') {
            return 0;
        }
        //递归的递推式应该是如果index的后两位小于等于26，
        // digui(s, start) = digui(s, start+1)+digui(s, start+2)
        // 否则digui(s, start) = digui(s, start+1)
        int ans1 = digui(s, start + 1);
        int ans2 = 0;
        if (start < s.length() - 1) {
            int ten = (s.charAt(start) - '0') * 10;
            int one = (s.charAt(start + 1) - '0');
            if (ten + one <= 26) {
                ans2 = digui(s, start + 2);
            }
        }
        return ans1 + ans2;
    }
}
