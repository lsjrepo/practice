package jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串
 * abc,acb,bac,bca,cab和cba。
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Solution24 {
    static ArrayList<String> result=new ArrayList<>();
    public static ArrayList<String> Permutation(String str) {
        char[] array=str.toCharArray();
        Arrays.sort(array);

        diedai(array,0,array.length-1);
        return result;
        }
    public static void diedai(char[] a,int start,int end){

        if (end<0){
            return ;
        }
        if (end==start){
            result.add(String.valueOf(a));
        }
        for(int i=start;i<=end;i++){

            swap(a,i,start);//固定第一个数,第一个数的取值分别为数组中的每一个数

            diedai(a,start+1,end);//对后n-1个数进行全排列

            swap(a,start,i);//把顺序换回来
        }
    }
    public static void swap(char[] c,int i,int j){
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
    }

    public static void main(String[] args) {
        /*System.out.println(Permutation("abc"));*/
        ArrayList<String> list=Permutation("abc");
        for (String a:list){
            System.out.println(a);
        }
    }
}
