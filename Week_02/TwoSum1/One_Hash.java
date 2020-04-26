package TwoSum1;

import java.util.HashMap;

/**
 * 思路：
 * 利用hash去存储，直接找到目标值
 */
public class One_Hash {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        getValue(arr,target);
    }
    public static int[] getValue(int arr[], int target){
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i=0;i<arr.length;i++){
            int need=target-arr[i];
            if (hash.containsKey(need)&&hash.get(need)!=i){
                int[] result = {i,hash.get(need)};
                return result;
            }
            hash.put(arr[i],i);
        }
        return null;
    }

}
