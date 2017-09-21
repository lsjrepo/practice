package xlei;

import java.util.*;

/**
 * 1~N一共有多少种组合可以使得和==sum?
 *
 */
public class Main01 {
    private static int result=0;
    public static void main(String[] args){
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        int sum=sin.nextInt();
        getSum1(n,sum);
        System.out.println(result);
    }
    private static void getSum1(int n,int sum) {
        /*LinkedList<Integer> list=new LinkedList();*/
        helper(1,n,sum);
   }

    private static void helper(int index, int n, int sum) {//从1-n找到和为sum的数组
        if (index<=sum){//超过sum肯定终止了(终止条件)
            if (index==n){//相当于遍历了一遍数组
               /* helper(index+1,m,n,list);
                list.push(index);
                for (Integer l:list){
                    System.out.printf("%d",l);
                }
                System.out.println();
                list.pop();*/
               result++;
            }
            if (index<sum){
                helper(index+1,n,sum);
                helper(index+1,n-index,sum);
            }
        }
    }
}
