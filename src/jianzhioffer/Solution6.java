package jianzhioffer;

/**
 * Created by Ji on 2017/6/21.
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
    n<=39
 */
public class Solution6 {
    public static int Fibonacci(int n) {
        if (n==0){
            return  0;
        }
        if (n==1||n==2){
            return 1;
        }
        int[] a=new int[n];
        a[0]=1;
        a[1]=1;
        for (int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }
}
