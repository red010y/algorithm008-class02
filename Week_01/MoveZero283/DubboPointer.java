package Algorithm.MoveZero283;

/**
 * 思路：
 * 双指针,i在非0位置停下来，j在0位置停下来
 * 之后进行互换
 */


public class DubboPointer {
    public static void main(String[] args) {
        int arr[]=new int[]{0,1,0,3,12};
        int j = 0;
        for (int i=0;i<arr.length;i++){
            if (i!=0) {
                int tmp = arr[j];
                arr[j++] = arr[i];
                arr[i] = tmp;
            }
        }
    }
}

/*public class DubboPointer {
    public static void main(String[] args) {
        int arr[]=new int[]{0,1,0,3,12};
        int j = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[j]=arr[i];
                if (i!=j){
                    arr[i]=0;
                }
                j++;
            }
        }
    }
}*/