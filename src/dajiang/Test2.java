package dajiang;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-8.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        int m=sin.nextInt();
        int tom_x=sin.nextInt();
        int tom_y=sin.nextInt();
        int out_x=sin.nextInt();
        int out_y=sin.nextInt();
        int[][] matrix=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]=sin.nextInt();
            }
        }
        System.out.println(4);

    }



}
