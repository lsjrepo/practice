package xchali;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xch on 2017/8/31.
 */
public class Meituan1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
         int n=scanner.nextInt();
         int[] a=new int[n];
         for (int i=0;i<n;i++){
            a[i]=scanner.nextInt();
         }
        System.out.println(getP1(a));
    }

    private static String getP1(int[] a) {
        if (a.length==3){
            return "Alice";
        }
        else{
            return "Bob";
        }
    }


}
