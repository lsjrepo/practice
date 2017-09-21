package xiechen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lsj on 17-9-21.
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sin.nextInt();
        }
        int m=sin.nextInt();
        int[] b=new int[m];
        for (int i=0;i<b.length;i++){
            b[i]=sin.nextInt();
        }
        System.out.println(getIt(a,b));
    }

    private static int getIt(int[] a, int[] b) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if (a[a.length-1]<b[0]){
             for (int i=0;i<(a.length+b.length);i++){
                 if (i<(a.length-1)){
                     arrayList.add(a[i]);
                 }
                 else{
                     arrayList.add(b[i-a.length+1]);
                 }
             }
        }
        else if (a[0]>b[b.length-1]){
            for (int i=0;i<(a.length+b.length);i++){
                if (i<b.length){
                    arrayList.add(b[i]);
                }
                else{
                    arrayList.add(a[i-b.length]);
                }
            }

        }
        if (arrayList.size()%2!=0){
            return arrayList.get(arrayList.size()/2);
        }
        else{
            return (arrayList.get(0)+arrayList.get(arrayList.size()-1))/2;
        }

    }
}
