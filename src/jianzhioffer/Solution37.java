package jianzhioffer;

import java.util.HashMap;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 思路:
 * 分两步
 * 第一步将原始数组拆分为两个数组，每个子数组只包含一个只出现一次的数字
 *
 * 第二步以此异或数组中的每一个数
 */
public class Solution37 {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length<2||array==null){
            return;
        }
       int temp=0;
       for (int i=0;i<array.length;i++){
           temp^=array[i];//结果为两个不同数字的异或结果
       }
       int position=findFirst1(temp);
        for(int i=0;i<array.length;i++){
            if (check(position,array[i])){
                num1[0]^=array[i];
            }
            else
            {
                num2[0]^=array[i];
            }
        }

    }
    public static int findFirst1(int t) {
        int p=0;
        while(((t&1)==0)&&(p<32)){
            t=t>>1;
           p++;
        }
        return p;
    }

    public static boolean check(int position,int a){
        a=a>>position;

        return (a&1)==1;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,1,2,3,4,5};
        int[] num1=new int[1];
        int[] num2=new int[1];
        FindNumsAppearOnce(a,num1,num2);
        System.out.println("第一个数字:"+num1[0]+"第二个数字"+num2[0]);
    }
}
