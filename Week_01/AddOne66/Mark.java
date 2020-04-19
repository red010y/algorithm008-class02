package Algorithm.Week_01.AddOne66;

/**
 * 思路：
 * 设计一个标记，是9的情况变为1，不是的情况是0
 * 遍历数组，判断值是否是9
 * 是9的当前位置变为0，不是9当前位置+1
 */
public class Mark {
    public static void main(String[] args) {
        int arr[]={9,9,9};
        int[] ints = plusOne(arr);
        System.out.println("");
    }

    private static int[] plusOne(int[] arr) {
        int mark=0;
        for (int i=arr.length-1;i>=0;i--){
            if (i==0&&arr[i]==9){
                arr[i]=0;
                int[] ints = new int[arr.length+1];
                ints[0]=1;
                for (int j=1;j<ints.length;j++){
                    ints[j]=arr[j-1];
                }
                return ints;
            }
            if (i==arr.length-1) {
                if (arr[i] == 9) {
                    arr[i] = 0;
                    mark = 1;
                    continue;
                } else {
                    arr[i] = arr[i] + 1;
                    return arr;
                }
            }
            if (arr[i]==9){
                arr[i] = 0;
                mark = 1;
                continue;
            }else {
                arr[i]=mark+arr[i];
                return arr;
            }
        }
        return null;
    }
}
