package Algorithm.removeDuplicates26;

/**
 * 思路：
 * 数组已经排序
 * 快慢指针，慢指针遇到重复停止移动，快指针在一直移动
 * 一旦快慢指针不相等，就进行把快指针值给慢指针+1的位置
 */
public class DubboPointer {
    public static void main(String[] args) {
        int arr[]={1,1,2};
        remover(arr);
    }

    private static int remover(int[] arr) {
        int slow=0;
        for (int fast=1;fast<arr.length;fast++){
            if (arr[slow]!=arr[fast]){
                slow++;
                arr[slow]=arr[fast];
            }
        }
        return slow+1;
    }
}
