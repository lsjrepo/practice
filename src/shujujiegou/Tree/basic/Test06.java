package shujujiegou.Tree.basic;

/**
 * 分割正整数，使得乘积最大
 */
public class Test06 {
    private static int N=8;
    private static int[] memo=new int[N+1];
    public static int integerBreak(int n){
            return breakInteger(n);
    }
    public static int breakInteger(int n){
        if (n==1){
            return 1;
        }
        if (memo[n]!=-1){
            return memo[n];
        }
        int  res=-1;
        for(int i=1;i<=n-1;i++){
            res=max3(res,i*(n-i),i*breakInteger(n-i));
        }
        memo[n]=res;
        return res;
    }

    private static int max3(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }


    public static void main(String[] args) {
        for (int i=0;i<N+1;i++){
            memo[i]=-1;
        }
        System.out.println(integerBreak(N));
    }
}
