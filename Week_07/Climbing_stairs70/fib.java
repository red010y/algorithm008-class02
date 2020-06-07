package Climbing_stairs70;

/**
 * 思路：
 * 经过计算发现爬楼梯符合斐波那契
 */
public class fib {
    public static void main(String[] args) {
        int num=40;
        System.out.println(fib(num));
    }
    public static int fib(int num){
        if (num<2){
            return 1;
        }
        return fib(num-1)+fib(num-2);
    }
}
