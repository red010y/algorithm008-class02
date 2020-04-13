package Algorithm.MoveZero283;

/**
 * 思路：
 * 记录0的个数，在数组末尾补0
 * 非0数前移
 */

public class DubboPointer_Brute {
    public static void main(String[] args) {
        int arr[]=new int[]{0,1,0,3,12};
        int zeroNum=0;
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                zeroNum++;
            }else {
                arr[j]=arr[i];
                j++;
            }
        }
        int index=arr.length-zeroNum;
        for (int i=0;i<zeroNum;i++){
            arr[index+i]=0;
        }
        for (int i:arr) {
            System.out.println(i);
        }
    }
}

/*public class DubboPointer {
    public static void main(String[] args) {
        int arr[]=new int[]{0,1,0,3,12};
        int j = 0;
        for (int i:arr){
            if (i!=0) {
                arr[j++] = i;
            }
        }
        while (j<arr.length){
            arr[j++]=0;
        }
    }
}*/
