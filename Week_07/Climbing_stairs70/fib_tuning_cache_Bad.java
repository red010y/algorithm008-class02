package Climbing_stairs70;

/**
 * 思路：
 * 加入数组进行缓存
 */
public class fib_tuning_cache_Bad {
    public static void main(String[] args) {
        int num=40;
        System.out.println(fib(num));
    }
    public static int fib(int num){
        int arr[]=new int[num+1];
        if(arr.length>2){
            arr[0]=1;
            arr[1]=1;
        }else{
            return 1;
        }
        if (arr[num]!=0){
            return arr[num];
        }
        arr[num]= fib(num-1)+fib(num-2);
        return arr[num];
    }
}
