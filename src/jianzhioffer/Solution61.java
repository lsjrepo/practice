package jianzhioffer;

/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
 * 每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），
 * 因为3+5+3+7 = 18。但是，它不能进入方格（35,38），
 * 因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Solution61 {
    public int movingCount(int threshold, int rows, int cols)
    {
        int[][] flag= new int[rows][cols];
        return getCount(0,0,rows,cols,flag,threshold);
    }

    public int getCount(int i, int i1, int rows, int cols, int[][] flag, int threshold) {
            if (i<0||i>=rows||i1<0||i1>=cols||(getSum(i)+getSum(i1))>threshold||flag[i][i1]==1){
                return 0;
            }
            flag[i][i1]=1;
            return getCount(i-1,i1,rows,cols,flag,threshold)+getCount(i+1,i1,rows,cols,flag,threshold)
                    +getCount(i,i1-1,rows,cols,flag,threshold)+getCount(i,i1+1,rows,cols,flag,threshold)+1;
    }

    private int getSum(int i) {


                int sum = 0;
                do{
                    sum += i%10;
                    }while((i = i/10) > 0);
                return sum;
    }
}
