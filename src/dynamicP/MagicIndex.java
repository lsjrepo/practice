package dynamicP;

/**
 * Created by Ji on 2017/4/27.
 * 在数组A[0..n-1]中，有所谓的魔术索引，满足条件A[i]=i。给定一个不下降序列，元素值可能相同，编写一个方法，
 * 判断在数组A中是否存在魔术索引。请思考一种复杂度优于o(n)的方法。
 给定一个int数组A和int n代表数组大小，请返回一个bool，代表是否存在魔术索引。
 测试样例：
 [1,1,3,4,5]
 */
public class MagicIndex {
    public  static  boolean binSearch(int[] A,int start,int end){
        if(start>end){
            return false;
        }
        else{
            int mid=(start+end)/2;
            if(A[mid]==mid){
                return true;
            }

                return binSearch(A,start,mid-1)||binSearch(A,mid+1,end);

        }

    }
    public static boolean findMagicIndex(int[] A, int n) {
        // write code here
        return (binSearch(A,0,n-1));

    }

    public static void main(String[] args) {
        int[] a={1,1,3,4,5};
        System.out.println(findMagicIndex(a,a.length));
    }
}