package basic.paixu;

import java.util.Scanner;

/**
 * Created by lsj on 17-8-13.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sin.nextInt();
        }
       /* bubbleSort(a,n);*/
        /*insertSort(a,n);*/
         selectSort(a,n);

        for (int i=0;i<n;i++){
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
    public static void quickSort(int[] a,int start,int end){

    }
    /**堆排序*/
    /**归并排序*/
    /**Shell排序*/
}
