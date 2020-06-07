package Climbing_stairs70;

public class Recursive_optimization {
    static int[] arr;
    public static void main(String[] args) {
        climbStairs(3);
    }

    public static int climbStairs(int n) {
        arr= new int[n+1];
        return climb(arr,n);
    }

    private static int climb(int[] arr, int n) {
        if (arr[n]!=0)return arr[n];
        if (n<=1){
            arr[n]=1;
            return 1;
        }
        arr[n]=climb(arr,n-1)+climb(arr,n-2);
        return arr[n];
    }
}
