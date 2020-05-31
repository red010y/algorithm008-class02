package FrogJump403;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 我们会利用散列表 mapmap，对于散列表中的 key:valuekey:value，keykey 表示当前石头的位置，
 * valuevalue 是一个包含 jumpsizejumpsize 的集合，
 * 其中每个 jumpsizejumpsize 代表可以通过大小为 jumpysizejumpysize 的一跳到达当前位置。
 * 首先我们对散列表初始化，keykey 为所有石头的位置，除了位置 0 对应的 valuevalue 为包含一个值 0 的集合以外，
 * 其余都初始化为空集。接下来，依次遍历每个位置上的石头。对于每个 currentPositioncurrentPosition，
 * 遍历 valuevalue 中每个 jumpsizejumpsize，判断位置 currentPosition + newjumpsizecurrentPosition+newjumpsize 是否存在于 mapmap 中，
 * 对于每个 jumpsizejumpsize，newjumpsizenewjumpsize 分别为 jumpsize-1jumpsize−1，jumpsizejumpsize，jumpsize+1jumpsize+1。
 * 如果找到了，就在对应的 valuevalue 集合里新增 newjumpsizenewjumpsize。重复这个过程直到结束。如果在结束的时候，最后一个位置对应的集合非空，那也就意味着我们可以到达终点，如果还是空集那就意味着不能到达终点。
 */
public class DP {
    public boolean canCross(int[] stones) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
            map.put(stones[i], new HashSet<Integer>());
        }
        map.get(0).add(0);
        for (int i = 0; i < stones.length; i++) {
            for (int k : map.get(stones[i])) {
                for (int step = k - 1; step <= k + 1; step++) {
                    if (step > 0 && map.containsKey(stones[i] + step)) {
                        map.get(stones[i] + step).add(step);
                    }
                }
            }
        }
        return map.get(stones[stones.length - 1]).size() > 0;
    }
}
