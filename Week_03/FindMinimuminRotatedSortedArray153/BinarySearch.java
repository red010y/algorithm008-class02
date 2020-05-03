package FindMinimuminRotatedSortedArray153;

/**
 * 1.中间数和左边界
 *
 * 当nums[mid] < nums[left]，能否确定最小值在左侧？——可以，此时说明区间[left...mid]出现了降序
 *
 * 当nums[mid] > nums[left]，能否确定最小值在右侧？——不能，当没有旋转的时候，最小值会在左侧
 *
 * 2.中间数和右边界
 *
 * 当nums[mid] < nums[right]，能否确定最小值在左侧？——可以，此时说明区间[mid...right]保持升序
 *
 * 当nums[mid] > nums[right]，能否确定最小值在右侧？——可以，此时说明区间[mid...right]出现了降序
 *
 */
public class BinarySearch {
    public int findMin(int[] nums) {
        if(nums == null){
            return 0;
        }
        int left = 0, right = nums.length - 1;
        while(left < right){//考虑终止条件
            int mid = left + (right-left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;// +1是因为mid一定不会是最小值
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
