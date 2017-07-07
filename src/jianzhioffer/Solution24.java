package jianzhioffer;

import java.util.*;


/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串
 * abc,acb,bac,bca,cab和cba。
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Solution24 {
    public static ArrayList<String> Permutation(String str) {
       ArrayList<String> result=new ArrayList<>();
       if(null==str||str.length()<1){
            return result;
       }
        char[] charArray=str.toCharArray();
        HashSet<String> hashSet=new HashSet<>();
        diedai(hashSet,charArray,0,charArray.length-1);
        result.addAll(hashSet);//去重
        Collections.sort(result);
        return result;
    }
    public static void diedai(HashSet<String> hashSet,char[] a,int start,int end){
        if (start==end){
            StringBuilder sb=new StringBuilder();
            for(char c:a){
                sb.append(c);
            }
            hashSet.add(sb.toString());
            return;
        }
        else{
            for(int i=start;i<=end;i++){
                swap(a,start,i);
                diedai(hashSet,a,start+1,end);
                swap(a,start,i);
            }
        }
    }
    public static void swap(char[] c,int i,int j){
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
    }

    public static void main(String[] args) {
        ArrayList<String> list=Permutation("aacdb");
        for (String s:list){
            System.out.println(s);
        }
    }
}
