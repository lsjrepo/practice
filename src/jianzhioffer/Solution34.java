package jianzhioffer;

/**
 *统计一个数字在排序数组中出现的次数。
 */
public class Solution34 {
    public static int GetNumberOfK(int [] array , int k) {

        int left=getFirstPosition(array,0,array.length-1,k);
        int right=getLastPosition(array,0,array.length-1,k);
        if (left==-1||right==-1){
            return 0;
        }
        return (right-left+1);

    }
    public  static  int getFirstPosition(int[] a, int start, int end, int k){
        if (start>end){
            return -1;
        }
        int mid=(start+end)>>1;
        if (a[mid]>k)
           return getFirstPosition(a,start,mid-1,k);
        else if (a[mid]<k){
            return getFirstPosition(a,mid+1,end,k);
        }
        else if ((mid-1)>=0&&a[mid-1]==k){
            return getFirstPosition(a,start,mid-1,k);
        }
        else{
            return mid;
        }

    }
    public  static  int getLastPosition(int[] a, int start, int end, int k){
        if (start>end){
            return -1;
        }
        int mid=(start+end)>>1;
        if (a[mid]>k)
            return getLastPosition(a,start,mid-1,k);
        else if (a[mid]<k){
            return getLastPosition(a,mid+1,end,k);
        }
        else if ((mid+1)<=end&&a[mid+1]==k){
            return getLastPosition(a,mid+1,end,k);
        }
        else{
            return mid;
        }

    }


}
