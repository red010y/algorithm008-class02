package Algorithm.Week1.removeDuplicates26.RotateArray189;

/**
 * 思路：
 * 反转数组
 * 反转前n个
 * 反转后面n-k个
 */
public class ThreeRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        k%=arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public static void reverse(int[] nums,int start, int end) {
        while (start<end){
            int tmp=nums[start];
            nums[start]=nums[end];
            nums[end]=tmp;
            start++;
            end--;
        }
    }
}
