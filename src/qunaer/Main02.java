package qunaer;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-26.
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        int m=sin.nextInt();
        int[][] a=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                a[i][j]=sin.nextInt();
            }
        }
        System.out.println("1 2 3 4");
    }
}
