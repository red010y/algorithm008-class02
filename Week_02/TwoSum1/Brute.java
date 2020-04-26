package TwoSum1;

/**
 * 两层for找到目标值
 */
public class Brute {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        get_Value_Brute(arr,target);
    }

    private static int[] get_Value_Brute(int[] arr, int target) {
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
