package dynamicP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ji on 2017/4/27.
 请编写一个方法，返回某集合的所有非空子集。
 给定一个int数组A和数组的大小int n，请返回A的所有非空子集。
 保证A的元素个数小于等于20，且元素互异。
 各子集内部从大到小排序,子集之间字典逆序排序，见样例。
 测试样例：
 [123,456,789]
 返回：{[789,456,123],[789,456],[789,123],[789],[456 123],[456],[123]}
 思路:
 step1:初始结果集为 [ [A[0] ]
 step2:遍历剩余 A[1] ~ A[n - 1]. 每取出一个元素遍加到 结果集：
 step3:复制一份结果集，并把元素加入到结果集中的每个集合的头部
 step4:合并 复制的结果集 + 只有当前元素的集合 + 原始结果集】
以下面的这个测试用力为例:
 step1:[[123]]
 step2:[[456 123] [456] [123]]
 step3:[[789 456 123] [789 456] [789 123] [789] [456 123] [456] [123]]
 */
public class Subset {
    public static ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        // write code here
        if(A==null||A.length==0){
            return new ArrayList<>();
        }
        Arrays.sort(A);//将数组升序排列
        return getAllSubsets(A,n);
    }
    public static ArrayList<ArrayList<Integer>> getAllSubsets(int[] A,int n){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        ArrayList<Integer> inner;
        if (n==1){
            inner=new ArrayList<>();
            inner.add(A[0]);
            outer.add(inner);
            return outer;
        }
        ArrayList<ArrayList<Integer>> tmp=getAllSubsets(A,n-1);//step1

        for(int i=0;i<tmp.size();i++){//本阶段新添加的那个数添加到原有的集合中
            inner =new ArrayList<Integer>();
            inner.add(A[n-1]);
            for(int j=0;j<tmp.get(i).size();j++){
                inner.add(tmp.get(i).get(j));
            }//获得本阶段含有所有变量的那个集合
            outer.add(inner);
        }
        inner=new ArrayList<Integer>();
        inner.add(A[n-1]);
        outer.add(inner);//本阶段新添加的那个数单独作为一个集合加入
        outer.addAll(tmp);//step4
        return outer;


    }

    public static void main(String[] args) {
        int[] a={123,456,789};
        System.out.println(getSubsets(a,a.length));
    }
}
