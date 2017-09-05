package shujujiegou.Tree.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 给定N和K,表示从[1,N]中选取K个数,找出所有取出的组合
 */
public class Test2 {
    private static List<List<Integer>> result;
    public static List<List<Integer>> combine(int n,int k){
        ArrayList<Integer> temp=new ArrayList<>();
        if(n<=0||k<=0||k>n){
            return result;
        }
        generateCombination(n,k,1,temp);
        return result;
    }
    public static void generateCombination(int n,int k,int start,ArrayList<Integer> list){//将从start开始的所有的可能情况放入到list中
        if (list.size()==k){
            result.add((List<Integer>) list.clone());
            /*System.out.println(result.toString());*/
            return;
        }
        /**这里可以采取一些优化的措施,
         * 循环开始的时候还有k-list.size和空位,所以[i...n]中至少有k-list.size个元素
         * i最多为n-(k-list.size)+1个元素
         * 在n个数据中找出*/
        for(int i=start;i<=n-(k-list.size())+1;i++){
            list.add(i);
            generateCombination(n,k,i+1,list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int N=sin.nextInt();
        int K=sin.nextInt();
        result=new ArrayList<>();
        System.out.println(combine(N,K));
    }
}
