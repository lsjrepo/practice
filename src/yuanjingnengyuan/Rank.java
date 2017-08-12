package yuanjingnengyuan;

import java.util.ArrayList;

/**
 * 求出输入数组前面有几个数比它小并通过数组的形式返回
 * 例如
 * {1,5,4,6,7,8,1}
 * 输出{0,1,1,3,4,5,0}
 */
public class Rank {
    public static int[] getRankOfNumber(int[] A, int n) {
        // write code here
        int[] result=new int[n];

        int count=0;
        for(int i=0;i<A.length;i++){
            for(int j=i-1;j>=0;j--){
                if (A[j]<A[i]){
                    count++;
                }
            }
            result[i]=count;
            count=0;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a={1,5,4,6,7,8,1};
        int[]c=getRankOfNumber(a,a.length);
        for (int i=0;i<7;i++){
            System.out.println(c[i]);
        }
    }
}