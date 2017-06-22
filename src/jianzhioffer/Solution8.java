package jianzhioffer;

/**
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution8 {
    public int JumpFloorII(int target) {
        if(target==0){
            return 0;
        }
        if (target==1){
            return 1;
        }
        int[] a=new int[target];
        a[0]=1;
        for(int i=1;i<target;i++){
            a[i]=2*a[i-1];
        }
        return a[target-1];
    }
}
