package wangyi;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by lsj on 17-9-16.
 */
public class Main13 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sin.nextInt();
        }
        quickSort(a,0,a.length-1);
        for (int i=0;i<a.length-1;i++){
            System.out.printf("%d ",a[i]);
        }
        System.out.printf("%d",a[a.length-1]);
    }

    private static void quickSort(int[] a, int start, int end) {
        LinkedList<Integer> s1=new LinkedList<>();
        if (start<end){
            s1.push(end);
            s1.push(start);
            while(!s1.isEmpty()){
                int k=s1.pop();
                int l=s1.pop();
                int idx=part(a,k,l);
                if (k<idx-1){
                    s1.push(idx-1);
                    s1.push(k);
                }
                if (l>idx+1){
                    s1.push(l);
                    s1.push(idx+1);
                }
            }
        }
    }

    private static int part(int[] a, int start, int end) {
        int p=a[start];
        while(start<end){
            while(start<end&&a[end]>=p){
                end--;
            }
            a[start]=a[end];
            while(start<end&&a[start]<=p){
                start++;
                a[end]=a[start];
            }
        }
        a[start]=p;
        return start;
    }
}
