package sll360;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lsj on 17-9-20.
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int sum=0;
        int n=sin.nextInt();
        int t=sin.nextInt();

        int[] a=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sin.nextInt();
        }
        Arrays.sort(a);
        for (int i=0;i<a.length;i++){
            if (sum<t){
                sum+=a[i];
            }
            else{
                sum-=a[i-1];
                break;
            }


        }
        sum+=a[a.length-1];
        System.out.println(sum);
    }
}
