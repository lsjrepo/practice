package basic.paixu;

import java.util.Scanner;

/**
 * Created by lsj on 17-8-13.
 */
public class Main1 {
    public static void main(String[] args) {
        /*Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sin.nextInt();
        }*/
        int[] a={1,2,30873,4,4589,6,7,8,9,10};
       /* bubbleSort(a,n);*/
        /*insertSort(a,n);*/
         /*selectSort(a,n);*/
        /*quickSort(a,0,a.length-1);*/
        for (int i=0;i<a.length-1;i++){
            heapSort(a,a.length-1-i);
            swap(a,0,a.length-1-i);
        }
        for (int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
    }
    /**冒泡排序*/
    public static void bubbleSort(int[] a,int n){
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }
        }
    }
    /**直接插入排序*/
    public static void insertSort(int[] a,int n){
        for (int i=0;i<n;i++){
            for (int j=i;j>0;j--){//假设前面的已经排好序了
                if (a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
    /**选择排序*/
    public static void selectSort(int[] a,int n){
        for(int i=0;i<n;i++){//i所指为已经排序的序列
            for(int j=i+1;j<n;j++){//j所指为未排序的序列
                if (a[j]<a[i]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
    /**快速排序*/
    public static int quickSortPartion(int[] a,int start,int end){
            int low=start-1;
            int pivoit=a[end];
            for(int high=start;high<end;high++){
                if (a[high]<=pivoit){
                    low++;
                    swap(a,low,high);
                }
            }
        swap(a,low+1,end);

            return low+1;
    }
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void quickSort(int[] a,int start,int end){
        if (start<end){
            int position=quickSortPartion(a,start,end);//确定按照主元进行分割的时候，主元所在的位置
            quickSort(a,start,position-1);
            quickSort(a,position+1,end);
        }
    }
    /**堆排序,每一次排序会求到最小值，最小堆的情况*/
    public static void heapSort(int[] a,int lastIndex){
        for (int i=(lastIndex-1)/2;i>=0;i--){
            int t=i;//最下层的右子树开始
            while((2*t+1)<=lastIndex){//这是当前节点下面的左节点
                int bIndex=2*t+1;
                if (bIndex<lastIndex){//如果还有右节点
                    if (a[bIndex]<a[bIndex+1]){
                        bIndex++;//这时指到右边的节点
                    }
                }
                if (a[t]<a[bIndex]){
                    swap(a,t,bIndex);
                    t=bIndex;//如果有子树的话，则继续往下构建
                }
                else{
                    break;//如果没有子树，那么往相邻的左子树部分移动
                }

            }

        }

    }
    /**归并排序*/

    /**Shell排序*/
}
