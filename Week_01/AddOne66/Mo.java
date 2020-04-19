package Algorithm.Week_01.AddOne66;

/**
 * 思路：
 * 循环判断当前的数+1后是否为0，模以10的操作
 * 如果不是返回。
 * 如果是继续
 * 如果循环走完新建一个数组，首位为1，长度为原来+1
 */
public class Mo {
    public static void main(String[] args) {
        int arr[]={9,9};
        mo(arr);
    }

    private static int[] mo(int[] arr) {
        for (int i=arr.length-1;i>=0;i--){
            arr[i]++;
            arr[i] = arr[i] % 10;
            if (arr[i]!=0)return arr;
        }
        int[] newArr = new int[arr.length + 1];
        newArr[0]=1;
        return newArr;
    }

}
