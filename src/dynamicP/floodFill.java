package dynamicP;

/**
 在一个nxm矩阵形状的城市里爆发了洪水，
 洪水从(0,0)的格子流到这个城市，在这个矩阵中有的格子有一些建筑，洪水只能在没有建筑的格子流动。
 请返回洪水流到(n - 1,m - 1)
 的最早时间(洪水只能从一个格子流到其相邻的格子且洪水单位时间能从一个格子流到相邻格子)。
 给定一个矩阵map表示城市，
 其中map[i][j]表示坐标为(i,j)的格子，
 值为1代表该格子有建筑，0代表没有建筑。
 同时给定矩阵的大小n和m(n和m均小于等于100)，
 请返回流到(n - 1,m - 1)的最早时间。
 保证洪水一定能流到终点。
 动态规划:
 1.初始化
 2.通过前一步的条件判断下一步
 3.得出最优解
 */
public class floodFill {
    public int floodFill(int[][] map, int n, int m) {
        // write code here
        if (map[0][0]==1){
            return -1;
        }
        int[][] temp=new int[n][m];

        for (int i=1;i<n;i++){
            if(map[i][0]==1){
                temp[i][0]=Integer.MAX_VALUE;
            }
            else{
                if(temp[i-1][0]==Integer.MAX_VALUE){
                    temp[i][0]=Integer.MAX_VALUE;
                }
                else{
                    temp[i][0]=temp[i-1][0]+1;
                }
            }
        }
        for(int j=1;j<m;j++){
            if (map[0][j]==1){
                temp[0][j]=Integer.MAX_VALUE;
            }
            else{
                if (temp[0][j-1]==Integer.MAX_VALUE){
                    temp[0][j]=Integer.MAX_VALUE;
                }
                else{
                    temp[0][j]=temp[0][j-1]+1;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(temp[i][j-1]==Integer.MAX_VALUE&&temp[i-1][j]==Integer.MAX_VALUE){
                    temp[i][j]=Integer.MAX_VALUE;
                }
                else{
                    temp[i][j]=Math.min(temp[i-1][j],temp[i][j-1])+1;
                }
            }
        }
        return temp[n-1][m-1];
    }
}
