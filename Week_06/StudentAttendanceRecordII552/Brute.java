package StudentAttendanceRecordII552;

public class Brute {
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
