package Climbing_stairs70;

public class DP_NoRecursive_NoArr {
    public static void main(String[] args) {
        int num=40;
        int first=1;
        int second=1;
        for (int i=2;i<=num;i++){
            int tmp=first;
            first=second;
            second=tmp+second;
        }
        System.out.println(second);
    }
}
