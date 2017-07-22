package jianzhioffer;

/**
 * 给定一个数组A[0,1,...,n-1],
 * 请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class Solution46 {
    //垃圾代码
    /*public static int[] multiply(int[] A) {
        int sum=1;
        int length=A.length;
        int[] res=new int[length];
        for (int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                if (i==j){
                    continue;
                }
                sum*=A[j];
            }
            res[i]=sum;
            sum=1;
        }
        return res;
    }*/
    //
    public static int[] multiply(int[] A) {
        int length=A.length;
        int[] b=new int[length];
        if (length!=0){
            b[0]=1;
            for(int i=1;i<length;i++){
                b[i]=b[i-1]*A[i-1];
            }
            int temp=1;
            for(int j=length-2;j>=0;j--){
                temp*=A[j+1];
                b[j]*=temp;
            }

        }
        return b;
    }
    public static void main(String[] args) {
        int[] a={2,4,6,8};
        int[] res=multiply(a);
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
