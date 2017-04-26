package basic;

/**
 * Created by lsj on 17-4-26.
 * 这是蘑菇的一道面试题，具体的题目当时太紧张居然忘记复制了
 * 大体如下:
 * 给定一个数，返回这个数在这个数组中的索引(好像还有一些条件。。)
 * 思路:
 * 二分法...
 * 如果数组是乱序的，先排一下序，再二分
 * 送分题!!!以后做不出来可以去屎了
 */
public class Main {
    public static int binSearch(int temp,int[] a,int start,int end){
                if(start>end){
                    return -1;
                }
                else{
                    int mid=(end+start)/2;
                    if(temp==a[mid]){
                        return mid ;
                    }
                    else if(temp<a[mid]){
                        return binSearch(temp,a,start,mid-1);
                    }
                    else{
                        return binSearch(temp,a,mid+1,end);
                    }
                }
    }
    public static void main(String[] args) {
            int[] a=new int[]{1,2,3,4,5,6,7};
        System.out.println(binSearch(5,a,0,a.length));
    }
}
