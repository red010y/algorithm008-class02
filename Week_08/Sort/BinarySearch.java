package Algorithm.Sort;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=1;
        int i = binarySearch(arr, target);
        System.out.println(i);
    }

    private static int binarySearch(int[] arr,int target) {
        int left=0;
        int right=arr.length-1;
        while (right>=left){
            int mid=(right+left)/2;
            if (arr[mid]==target)return mid;
            else if (arr[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }

}
