package jianzhioffer;

import java.util.*;

/**
 * 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的
 * 思路:还是和前面一样选取两个指针
 *
 */
public class Solution39 {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> result=new ArrayList<>();
        if (array.length<2||array==null){
            return result;
        }
        int start=0;
        int end=array.length-1;
        while(start<end){
            if ((array[start]+array[end])==sum){
               result.add(array[start]);
               result.add(array[end]);
                return result;
            }
            else if ((array[start]+array[end])>sum){
                end--;
            }
            else {
                start++;
            }
        }
    return result;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        System.out.println(FindNumbersWithSum(a,10));
    }
}
