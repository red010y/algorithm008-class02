package FrogJump403;

import java.util.Arrays;

/**
 * 我们定义一个递归方法 canCrosscanCross，这个方法的输入参数为石子列表，
 * 当前位置和当前的 jumpsizejumpsize。算法从 currentPosition=0currentPosition=0，
 * jumpsize=0jumpsize=0 开始，接下来每一次调用，从 currentPositioncurrentPosition 开始，
 * 检查在位置 (currentPostion + newjumpsize)(currentPostion+newjumpsize) 处有没有石子，
 * 其中 newjumpsizenewjumpsize 值依次为 jumpsizejumpsize， jumpsize+1jumpsize+1，
 * jumpsize-1jumpsize−1。在这里我们直接遍历数组来检查特定位置上有没有石子。如果有一个石子的话，
 * 就再次调用递归方法，传入同样的石子列表，新的 currentPositioncurrentPosition 和 newjumpsizenewjumpsize。
 * 如果在经过数次递归之后抵达了终点的那块石头，返回 true。
 */
public class Brute {
    public boolean canCross(int[] stones) {
        return can_Cross(stones, 0, 0);
    }
    public boolean can_Cross(int[] stones, int ind, int jumpsize) {
        if (ind == stones.length - 1) {
            return true;
        }
        int ind1 = Arrays.binarySearch(stones, ind + 1, stones.length, stones[ind] + jumpsize);
        if (ind1 >= 0 && can_Cross(stones, ind1, jumpsize)) {
            return true;
        }
        int ind2 = Arrays.binarySearch(stones, ind + 1, stones.length, stones[ind] + jumpsize - 1);
        if (ind2 >= 0 && can_Cross(stones, ind2, jumpsize - 1)) {
            return true;
        }
        int ind3 = Arrays.binarySearch(stones, ind + 1, stones.length, stones[ind] + jumpsize + 1);
        if (ind3 >= 0 && can_Cross(stones, ind3, jumpsize + 1)) {
            return true;
        }
        return false;
    }
}
