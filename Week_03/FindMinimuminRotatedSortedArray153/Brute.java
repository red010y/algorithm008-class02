package FindMinimuminRotatedSortedArray153;

/**
 * 对数组进行遍历，找到比前一个位置元素小（降序）的位置，即为最小值。如果没有降序，意味着数组没有旋转，旋转点为最后一个位置。那么最小值将是第一个元素。
 */
public class Brute {
    public int findMin(int[] nums) {
        if(nums == null){
            return 0;
        }
        int min = nums[0];
        for(int i : nums){
            if(i < min){
                min = i;
                break;
            }
        }
        return min;
    }
}
