package didi;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-10.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int N=sin.nextInt();
        System.out.println(getU(N));
    }
    public static int getU(int index) {
        if (index<=0) return 0;
        if (index==1) return 1;
        int[] k=new int[index];
        k[0]=1;
        int t2=0,t3=0,t5=0;
        for(int i=1;i<index;i++){
            k[i]=Math.min(k[t2]*2,Math.min(k[t3]*3,k[t5]*5));
            if (k[i]==k[t2]*2) t2++;
            if (k[i]==k[t3]*3) t3++;
            if (k[i]==k[t5]*5) t5++;
        }
        return k[index-1];
    }

}
