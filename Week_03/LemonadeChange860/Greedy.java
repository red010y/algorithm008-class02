package LemonadeChange860;

/**
 * 0 <= bills.length <= 10000
 * 只有5、10、20，倍数关系
 * 开始没有钱
 */
public class Greedy {
    private boolean greedySolution(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            switch (bill) {
                case 5: five++; break;
                case 10: five--; ten++; break;
                case 20: {
                    if (ten > 0) {
                        ten--; five--;
                    } else {
                        five -= 3;
                    }
                    break;
                }
                default: break;
            }
            if (five < 0) {
                return false;
            }
        }
        return true;
    }
}
