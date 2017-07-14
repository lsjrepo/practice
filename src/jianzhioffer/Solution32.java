package jianzhioffer;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。
 * 即输出P%1000000007
 */
//暴力循环，时间复杂度O(n*n)
/*public class Solution32 {
    public static int InversePairs(int [] array) {
        int count=0;
        if (array.length==0){
            return -1;
        }
        for (int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if (array[i]>array[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a={2,4,3,1};
        System.out.println(InversePairs(a));
    }
}*/
public class Solution32 {
    static int count;
    public  static int InversePairs(int [] array) {
        count=0;
        if (array.length!=0){
            mergeSort(array,0,array.length-1);
        }
        return count;
    }
    public static void mergeSort(int[] array,int start,int end){
        if (start>=end){
            return;
        }
        int mid=(start+end)>>1;
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        merge(array,start,mid,end);
    }
    public static void merge(int[] array,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=start,j=mid+1,k=0;
        while(i<=mid&&j<=end){
            if (array[i]<=array[j]){//合并的时候，如果前半部分的值小于后半部分的值
                temp[k++]=array[i++];
            }
            else{//前半部位置i上的那个数比你大，那么后后面的数都比你大，构成逆序数
                temp[k++]=array[j++];
                count+=(mid-i+1);

            }
        }
        while(i<=mid){//左边还有剩余
            temp[k++]=array[i++];
        }
        while(j<=end){//右边还有剩余
            temp[k++]=array[j++];
        }
        for(k=0;k<temp.length;k++){
            array[start+k]=temp[k];//将临时数组添加到原来的数组后边
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(a));
    }

}