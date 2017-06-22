package jianzhioffer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法.
 */
public class Solution7 {
    public int JumpFloor(int target) {
        if (target==0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        int[] a=new int[target];
        a[0]=1;
        a[1]=2;
        for(int i=2;i<a.length;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[target-1];
    }
}
