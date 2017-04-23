package BinaryStudy;

/**
 * Created by lsj on 17-4-23.
 有一些数的素因子只有3、5、7，请设计一个算法，找出其中的第k个数。
 给定一个数int k，请返回第k个数。保证k小于等于100。
 测试样例：3
 返回：7
 网络上的方法,比较巧妙这里记录一下

 */
public class KthNumber {
    public  static int min(int a,int b,int c){
        int tmp=(b>c?c:b);
        return a>tmp?tmp:a;
    }
    public  static  int findKth(int k) {
        // write code her]
        int[] a=new int[k+1];
        a[0]=1;
        int t3=0,t5=0,t7=0;
        for(int i=1;i<a.length;i++){
            a[i]=min(a[t3]*3,a[t5]*5,a[t7]*7);
            if(a[i]==a[t3]*3) t3++;
            if(a[i]==a[t5]*5) t5++;
            if(a[i]==a[t7]*7) t7++;
        }
        return a[k];
    }

    public static void main(String[] args) {
        System.out.println(findKth(16));
    }
}