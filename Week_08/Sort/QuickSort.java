package Algorithm.Sort;

/**
 * 思路：
 * 不断的填坑，先从尾部找比基数小的元素，之后填入基数的坑
 * 之后从首部找比基数大的元素填入尾部的坑
 * 直到首尾相遇，相遇点就是基数的位置
 * 之后递归的进行这个过程，把所有的元素进行排序
 */
public class QuickSort {


    public static void main(String[] args){
        int array[] = {2,1,4,3,9,7,8,6};

        quickSort(array,0,array.length-1);
        for( int i = 0 ; i < array.length ; i++ ){
            System.out.print(array[i]+" ");
        }
    }
    private static void quickSort(int[] arr,int l,int r){
        if( l >= r )  return;
        int p = partition(arr,l,r);
        quickSort(arr,l,p-1);
        quickSort(arr,p+1,r);
    }
    private static int partition(int[] arr,int l,int r){
        int x=arr[l];
        while (r>l) {
            while (r > l && arr[r] >= x) {
                r--;
            }
            if (r > l) {
                arr[l] = arr[r];
                l++;
            }
            while (r > l && arr[l] < x) {
                l++;
            }
            if (r > l) {
                arr[r] = arr[l];
                r--;
            }
        }
        arr[l]=x;
        return l;
    }

}