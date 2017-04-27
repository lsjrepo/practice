package dynamicP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ji on 2017/4/27.
 请编写一个方法，返回某集合的所有非空子集。
 给定一个int数组A和数组的大小int n，请返回A的所有非空子集。保证A的元素个数小于等于20，且元素互异。
 各子集内部从大到小排序,子集之间字典逆序排序，见样例。
 测试样例：
 [123,456,789]
 返回：{[789,456,123],[789,456],[789,123],[789],[456 123],[456],[123]}
 */
public class Subset {
    public ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        // write code here
            if(A==null||A.length==0){
                return new ArrayList<>();
            }
        Arrays.sort(A);
        return getAllSubsets(A,n);

    }
    public ArrayList<ArrayList<Integer>> getAllSubsets(int[] A,int n){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        ArrayList<Integer> inner;
        if (n==1){
            inner=new ArrayList<>();
            inner.add(A[0]);
            outer.add(inner);
            return outer;
        }
        ArrayList<ArrayList<Integer>> tmp=getAllSubsets(A,n-1);

        for(int i=0;i<tmp.get(i).size();i++){
            inner =new ArrayList<Integer>();
            inner.add(A[n-1]);
            for(int j=0;j<tmp.get(i).size();j++){
                inner.add(tmp.get(i).get(j));
            }
            outer.add(inner);
        }
        inner=new ArrayList<Integer>();
        inner.add(A[n-1]);
        outer.add(inner);
        outer.addAll(tmp);
        return outer;


    }
}
