package pingduoduo;

import java.util.Scanner;

/**
 * Created by lsj on 17-8-1.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++ ){
            a[i]=Integer.parseInt(sin.next());
        }
        System.out.println(findMax(a));
    }

    private static int findMax(int[] a) {
        int length=a.length;
        int i=a[0];
        int j=a[0];
        int max=i;
        for(int k=1;k<length;k++){
            i= Math.max(a[k],Math.max(a[k]*i,a[k]*j));
            j=Math.min(a[k],Math.min(a[k]*i,a[k]*j));
            max=Math.max(max,i);
        }
        return max;
    }
}
