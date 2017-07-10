package jianzhioffer;

/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Solution30 {
    public static int GetUglyNumber_Solution(int index) {
       if (index<=0) return 0;
       if (index==1) return 1;
       int[] k=new int[index];
       k[0]=1;
       int t2=0,t3=0,t5=0;
       for(int i=1;i<index;i++){
           k[i]=Math.min(k[t2]*2,Math.min(k[t3]*3,k[t5]*5));
           if (k[i]==k[t2]*2) t2++;
           if (k[i]==k[t3]*3) t3++;
           if (k[i]==k[t5]*5) t5++;
       }
       return k[index-1];
    }

    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(4));
    }
}
