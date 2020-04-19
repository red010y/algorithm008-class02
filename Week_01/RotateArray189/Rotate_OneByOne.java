package Algorithm.Week1.removeDuplicates26.RotateArray189;

/**
 * 思路：
 * 旋转k次，一次旋转移动一个
 * 记录最后一个数，不断的把最后一个数和当前的数换位置
 * 最后就能换到倒数第二个到最后位置
 */
public class Rotate_OneByOne {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr,k);
    }
    public static void rotate(int[] nums, int k) {
        for (int i=0;i<k;i++){
            int end=nums[nums.length-1];
            for (int j=0;j<nums.length;j++){
                int tmp=nums[j];
                nums[j]=end;
                end=tmp;
            }
        }
    }
}
