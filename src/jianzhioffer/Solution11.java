package jianzhioffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution11 {
    public static  void reOrderArray(int [] array) {
        for(int i=1;i<array.length;i++){
            int temp=array[i];
            if (temp%2!=0){
                for(int j=i;j>0;j--){
                    if (array[j-1]%2==0){
                        int k=array[j];
                        array[j]=array[j-1];
                        array[j-1]=k;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] a=new int[]{16,8,25,3,9,27};
        reOrderArray(a);
        for (int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
    }
}
