package shujujiegou.Tree.basic;

/**
 * Created by lsj on 17-9-3.
 * 斐波那契数列的优化解法
 */
public class Test05 {
    public static int fib(int n,int[] memory){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (memory[n]==-1){
            memory[n]=fib(n-1,memory)+fib(n-1,memory);
        }
        return memory[n];
    }

    public static void main(String[] args) {
        int[] memory=new int[5];
        for(int i=0;i<memory.length;i++){
            memory[i]=-1;
        }
        System.out.println(fib(4,memory));
    }
}
