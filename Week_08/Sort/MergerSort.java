package Algorithm.Sort;

import java.util.Arrays;

/*
    分治法
　　a.分解原问题为若干个子问题，这些子问题是原问题的规模较小的实例；

　　b. 解决这些子问题，递归地求解各子问题的规模足够小，则直接求解；代码里在rigtht-Bitwise_Left<10的情况下直接进行进行插入排序

　　c. 合并这些子问题的解成原问题的解。

该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。将已有序的子序列合并，得到完全有序的序列；
即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并。
1、把长度为n的输入序列分成两个长度为n/2的子序列；
2、对这两个子序列分别采用归并排序；
3、将两个排序好的子序列合并成一个最终的排序序列。
* */
public class MergerSort {
    /*******************测试************************/
    public static void main(String[] args) {
        int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 , 9 , 19 ,12,16,14,12,22,33 };

        mergeSort(nums , 0 , nums.length - 1 );
        System.out.println(Arrays.toString(nums));
    }
    /********************算法************************/
    /*
        arr：要处理的数组
        l：开始位置
        r：结束位置
        递归对arr[ l ... r ]范围的元素进行排序
     */
    private static void mergeSort(int[] arr,int left,int right){
        if( right - left <= 10 ){   //当数据很少的时候使用插入排序算法
            insertionSort(arr,left,right);
            return;
        }
        int middle = ( left + right ) / 2;  //计算中点位置
        mergeSort( arr , left , middle );   //不断地对数组的左半边进行对边分
        mergeSort( arr , middle+1 , right );   //不断地对数组的右半边进行对半分
        if( arr[middle] > arr[middle+1] ) {      //当左边最大的元素都比右边最小的元素还小的时候就不用归并了
            merge(arr, left, middle, right);     //最后将已经分好的数组进行归并
        }
    }
    //将arr[ l... mid ]和arr[ mid ... r ]两部分进行归并
    /*
        有序的左右两端元素进行比较，右侧第一个比较左侧第一个的大小
        |2, 7, 8, 3, 1  |  6, 9, 0, 5, 4|
     */
    private static void merge(int[] arr, int left, int mid, int right) {//riaght是数组长度
        int arr1[] = new int[ right - left + 1 ];   //定义临时数组
        for( int i = left ; i <= right ; i++ )  {    //将数组的元素全部复制到新建的临时数组中
            arr1[ i - left ] = arr[ i ];
        }
        int i = left;
        int j = mid + 1;     //定义两个索引
        for( int k = left;k <= right ; k++){//给真正的数组赋值
            if( i > mid )   //如果左边都比较完了
            {
                arr[ k ] = arr1[ j - left ];   //直接将右边的元素都放进去
                j++;
            }
            else if( j > right ){   //右边都比较完了
                arr[ k ] = arr1 [i - left ];   //直接将左边的元素放进去
                i++;
            }
            else if( arr1[ i-left ] < arr1[ j-left ] ){//左右两侧最小的值进行比较，找出最小的放入真正的数组
                arr[ k ] = arr1[ i - left];
                i++;
            }
            else
            {
                arr[ k ] = arr1[ j - left];
                j++;
            }
        }
    }

    private static void insertionSort(int[] arr,int left,int right){

        for (int i=left+1;i<=right;i++){
            int nullIndex = i;
            int current=arr[i];
            for (int j=i-1;j>=0;j--){
                if (arr[j]>current){
                    nullIndex=j;
                    arr[j+1]=arr[j];
                }
            }
            arr[nullIndex]=current;
        }
    }
}
