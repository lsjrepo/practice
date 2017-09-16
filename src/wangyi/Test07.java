package wangyi;

import java.util.Scanner;

/**
 * 小Q和牛博士合唱一首歌曲,这首歌曲由n个音调组成,每个音调由一个正整数表示。
 对于每个音调要么由小Q演唱要么由牛博士演唱,对于一系列音调演唱的难度等于所有相邻音调变化幅度之和,
 例如一个音调序列是8, 8, 13, 12, 那么它的难度等于|8 - 8| + |13 - 8| + |12 - 13| = 6(其中||表示绝对值)。
 现在要对把这n个音调分配给小Q或牛博士,让他们演唱的难度之和最小,请你算算最小的难度和是多少。
 如样例所示: 小Q选择演唱{5, 6}难度为1, 牛博士选择演唱{1, 2, 1}难度为2,难度之和为3,这一个是最小难度和的方案了。
 输入描述:
 输入包括两行,第一行一个正整数n(1 ≤ n ≤ 2000) 第二行n个整数v[i](1 ≤ v[i] ≤ 10^6), 表示每个音调。
 *
 *
 */
public class Test07 {
    static int maxn=2000+5;
    static int[] v=new int[maxn];
    static int[][] dp=new int[maxn][maxn];
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int len = sin.nextInt();
        int[] a = new int[len];
        a[0]=-1;
        for (int i = 1; i <= a.length; i++) {
            a[i] = sin.nextInt();
        }
        for(int i=0;i<maxn;i++){
            for (int j=0;j<maxn;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(minDifference(0,0,len));
    }

    public static int minDifference(int a,int b,int len) {
        int now=Math.max(a,b)+1;
        if (now==len+1) return 0;
            if (dp[a][b]!=-1) return dp[a][b];
        return dp[a][b] = Math.min(minDifference(now, b,len) + (a>0 ? Math.abs(v[now] - v[a]) : 0), minDifference(a, now,len) + (b>0 ? Math.abs(v[now] - v[b]) : 0));

    }
}

