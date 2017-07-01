package jianzhioffer;

import jdk.internal.dynalink.beans.StaticClass;

import java.util.ArrayList;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Solution21 {
    public static boolean VerifySquenceOfBST(int [] sequence) {
       if (sequence.length==0){
           return false;
       }
       return verify(sequence);
    }
    public static boolean verify(int [] sequence){
        int n=sequence.length;
        if (n == 1 || n == 0 ) {
            return true;
        }
        int root=sequence[n-1];
        ArrayList<Integer> leftPart=new ArrayList<Integer>();
        ArrayList<Integer> rightPart=new ArrayList<Integer>();
        int i=0;
        for(;i<n-1;i++){
            if (sequence[i]<root)
                leftPart.add(sequence[i]);
            else break;
        }
        int[] left=new int[leftPart.size()];
        for (int k=0;k<left.length;k++){
            left[k]=leftPart.get(k);
        }
        for (;i<n-1;i++){
            if (sequence[i]>root){
                rightPart.add(sequence[i]);
            }
            else{
                return false;
            }
        }
        int[] right=new int[rightPart.size()];
        for (int k=0;k<right.length;k++){
            right[k]=rightPart.get(k);
        }
        return  verify(left)&&verify(right);

    }

    public static void main(String[] args) {
        int[] a={4,8,6,12,16,14,10};
        System.out.println(VerifySquenceOfBST(a));
    }

}
