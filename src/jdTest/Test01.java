package jdTest;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-8.
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        int[] h=new int[n];
        for (int i=0;i<n;i++){
            h[i]=sin.nextInt();
        }
        System.out.println(findPath(h));
    }

    public static int findPath(int[] h) {
       int count=h.length-1;
       for (int i=0;i<h.length;i++){
           for (int j=i+1;j<h.length-1;j++){
               if (h[j]>h[j+1]){
                   break;
               }
               count++;
           }
       }
       return count;
    }
}
