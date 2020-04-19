package Algorithm.Week_01.AddOne66;

public class Brute {
    public static void main(String[] args) {
        int arr[]={9,9};
        get(arr);
    }

    private static int[] get(int[] arr) {
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] ints = new int[arr.length + 1];
        ints[0]=1;
        return ints;
    }
}
