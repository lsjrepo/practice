package xchali;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-14.
 */
public class Main2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println(getP2(a));
    }

    private static int getP2(int[] a) {

        int count=0;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                String s=a[i]+""+a[j];
                if(Integer.valueOf(s)%7==0){
                    count++;
                }
            }
        }
        for (int i=a.length-1;i>=0;i--){
            for (int j=i-1;j>=0;j--){
                String s=a[i]+""+a[j];
                if(Integer.valueOf(s)%7==0){
                    count++;
                }
            }
        }
        return count;
    }


}
