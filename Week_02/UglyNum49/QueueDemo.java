package UglyNum49;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class QueueDemo {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Set<Long> s = new HashSet<>();
        //初始化,放进堆和set，发现1要开Long数组才可以
        long[] primes = new long[]{2, 3, 5};
        for (long prime : primes) {
            pq.offer(prime);
            s.add(prime);
        }
        long num = 1;
        for (int i = 1; i < n; i++) {
            num = pq.poll();
            //遍历三个因子
            for (int j = 0; j < 3; j++) {
                if (!s.contains(num * primes[j])) {
                    pq.offer(num * primes[j]);
                    s.add(num * primes[j]);
                }
            }
        }
        return (int) num;
    }
}
