package Algorithm.Week_01.TwoSum1;

import java.util.HashMap;

/**
 * 两次hash，先把数据都放到hash，在循环判断
 */
public class Two_Hash {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        get_Value(arr,target);
    }

    private static int[] get_Value(int[] arr, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i=0;i<arr.length;i++){
            hash.put(arr[i],i);
        }
        for (int i=0;i<arr.length;i++){
            if (hash.containsKey(target-arr[i])&&hash.get(target-arr[i])!=i){
                return new int[]{i,hash.get(target-arr[i])};
            }
        }
        return null;
    }
}
