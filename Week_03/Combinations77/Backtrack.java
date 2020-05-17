package Combinations77;

import java.util.LinkedList;
import java.util.List;

/**
 * 遍历从 first t到 n的所有整数。
 *
 * 将整数 i 添加到现有组合 curr中。
 *
 * 继续向组合中添加更多整数 :
 * backtrack(i + 1, curr).
 *
 * 将 i 从 curr中移除，实现回溯。
 *
 */
public class Backtrack {
    List<List<Integer>> output = new LinkedList();
    int n;
    int k;

    public void backtrack(int first, LinkedList<Integer> curr) {
        // if the combination is done
        if (curr.size() == k)
            output.add(new LinkedList(curr));

        for (int i = first; i < n + 1; ++i) {
            // add i into the current combination
            curr.add(i);
            // use next integers to complete the combination
            backtrack(i + 1, curr);
            // backtrack
            curr.removeLast();
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtrack(1, new LinkedList<Integer>());
        return output;
    }

}
