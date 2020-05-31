package TaskScheduler621;

import java.util.Arrays;

/**
 * 在前两种方法中，我们了解到应当尽早安排出现次数较多的任务。
 * 我们假设 A 为出现次数最多的任务，假设其出现了 p 次，考虑到冷却时间，
 * 那么执行完所有任务的时间至少为 (p - 1) * (n + 1) + 1。
 * 我们把这个过程形象化地用图 1 表现出，可以发现，CPU 产生了 (p - 1) * n 个空闲时间，只有 p 个时间是在工作的。
 */
public class Desgin {
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for (char c: tasks)
            map[c - 'A']++;
        Arrays.sort(map);
        int max_val = map[25] - 1, idle_slots = max_val * n;
        for (int i = 24; i >= 0 && map[i] > 0; i--) {
            idle_slots -= Math.min(map[i], max_val);
        }
        return idle_slots > 0 ? idle_slots + tasks.length : tasks.length;
    }
}
