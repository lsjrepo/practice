package wangyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 小易将n个棋子摆放在一张无限大的棋盘上。
 * 第i个棋子放在第x[i]行y[i]列。
 * 同一个格子允许放置多个棋子。
 * 每一次操作小易可以把一个棋子拿起并将其移动到原格子的
 * 上、下、左、右的任意一个格子中。
 * 小易想知道要让棋盘上出现有一个格子中至少有i(1 ≤ i ≤ n)
 * 个棋子所需要的最少操作次数.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        ArrayList<Integer> temp=new ArrayList<>();
        int n=sin.nextInt();
        int[] x=new int[n];
        int[] y=new int[n];
        for (int i=0;i<n;i++){
            x[i]=sin.nextInt();
        }
        for(int j=0;j<n;j++){
            y[j]=sin.nextInt();
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    for(int l=0;l<n;l++){
                        temp.add(Math.abs(x[k]-x[i])+Math.abs(y[k]-y[j]));
                    }
                }


            }
        }

    }
}
