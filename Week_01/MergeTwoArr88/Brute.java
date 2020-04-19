package Algorithm.Week_01.MergeTwoArr88;

import java.util.Arrays;

/**
 * 思路：
 * 把数组元素全放到num1，之后进行排序
 */
public class Brute {
    public static void main(String[] args) {
        int num1[]={};
        int num2[]={};
        int m=3,n=4;
        brute(num1,m,num2,n);

    }

    /**
     * 　　Object src : 原数组
     *    int srcPos : 从元数据的起始位置开始
     * 　　Object dest : 目标数组
     * 　　int destPos : 目标数组的开始起始位置
     * 　　int length  : 要copy的数组的长度
     */
    private static int[] brute(int[] num1, int n, int[] num2, int m) {
        System.arraycopy(num2, 0, num1, m, n);
        Arrays.sort(num1);
        return num1;
    }

}
