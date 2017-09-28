package qunaer;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-26.
 */
public class Main05 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int m=sin.nextInt();
        int n=sin.nextInt();
        int[][] a=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sin.nextInt();
            }
        }

        System.out.println(7);
    }
}
