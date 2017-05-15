package dynamicP;

/**
 * Created by lsj on 17-5-15.
 *  请设计一种算法，解决著名的n皇后问题。这里的n皇后问题指在一个nxn的棋盘上放置n个棋子，
 *  使得每行每列和每条对角线上都只有一个棋子，求其摆放的方法数。
    给定一个int n，请返回方法数，保证n小于等于15
    测试样例：
         1
    返回：1
 */
public class Queues {
    public int nQueens(int n) {
        // write code here
        if (n<=0){
            return -1;
        }
        int[] position=new int[n];//position[i]表示第i行皇后的列号
        return place(position,0,n);
    }

    private int place(int[] position, int i, int n) {
        if (i==n){
            return  1;
        }
        int count=0;
        for(int j=0;j<n;j++){
            if(isvalid(position,i,j)){//如果当前的位置是有效的
                position[i]=j;
                count+=place(position,i+1,n);//往下挪一行
            }
        }
        return count;
    }

    private boolean isvalid(int[] position, int i, int j) {
        for(int k=0;k<i;k++){
            if ((j==position[k])||(Math.abs(position[k]-j)==Math.abs(i-k))){//如果同在一个列
                return false;
            }
        }
        return true;
    }
}
