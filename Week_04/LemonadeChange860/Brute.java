package LemonadeChange860;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 先用大的找零
 */
public class Brute {
    private boolean directlySolution(int[] bills) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int bill : bills) {
            int change = bill - 5;
            while (change > 0) {
                if (queue.size() <= 0) {
                    return false;
                }
                boolean isFound = false;
                for (Integer i : queue) {
                    if (change - i >= 0) {
                        change = change - i;
                        queue.remove(i);
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    return false;
                }
            }

            if (bill < 20) {
                queue.add(bill);
            }
        }

        return true;
    }

}
