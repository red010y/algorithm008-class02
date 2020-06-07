package Climbing_stairs70;

/**
 * 思路：
 * 不用递归，一直加到楼梯的顶部
 */
public class DP_NoRecursive {
    public static void main(String[] args) {
        int num=40;
        int arr[]=new int[num+1];
        arr[0]=1;
        arr[1]=1;
        for (int i=2;i<=num;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[num]);
    }
}
