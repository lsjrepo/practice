package dynamicP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
<<<<<<< Updated upstream
 * Created by lsj on 17-5-11.
 * 编写一个方法，确定某字符串的所有排列组合。
   给定一个string A和一个int n,代表字符串和其长度，请返回所有该字符串字符的排列，
   保证字符串长度小于等于11且字符串中字符均为大写英文字符，排列中的字符串按字典序从大到小排序。(不合并重复字符串)
   测试样例：
   "ABC"
    返回：["CBA","CAB","BCA","BAC","ACB","ABC"]
 */
public class Permutation {
    public   ArrayList<String> getPermutation(String A) {
        // write code here
        ArrayList<String> arrayList=new ArrayList<>();
        getAllSubsets(arrayList,A.toCharArray(),0);
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        return arrayList;
    }
    public   void getAllSubsets(ArrayList<String> lists,char[] a,int n){
            if (n==a.length){
                lists.add(new String(a));
                return;
            }
            for(int i=n;i<a.length;i++){
                swap(a,i,n);
                getAllSubsets(lists,a,n+1);
                swap(a,n,i);
            }
    }

    public  void swap(char[] a,int i,int j){
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args){
        System.out.println();
    }
/*
 * Created by Ji on 2017/5/2.
 编写一个方法，确定某字符串的所有排列组合。
 给定一个string A和一个int n,代表字符串和其长度，请返回所有该字符串字符的排列，
 保证字符串长度小于等于11且字符串中字符均为大写英文字符，
 排列中的字符串按字典序从大到小排序。(不合并重复字符串)
 测试样例：
 "ABC"
 返回：["CBA","CAB","BCA","BAC","ACB","ABC"]
 */
 class MyComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
/*public class Permutation {
    public ArrayList<String> getPermutation(String A) {
        // write code here
        ArrayList<String> result=new ArrayList<>();
        char[] c=A.toCharArray();

        return result;
    }*/
}
