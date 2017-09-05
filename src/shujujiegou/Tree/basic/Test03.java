package shujujiegou.Tree.basic;

import java.util.Scanner;

/**
 * LeetCode79
 */
public class Test03 {
    private static int m=3;
    private static int n=4;
    private static int[][] d={{-1,0},{0,1},{1,0},{0,-1}};//表示方向
    private static Boolean[][] visited=new Boolean[m][n];//判断是否已经访问过
    public static boolean inArea(int x,int y,int m,int n){
        return x>=0&&x<m&&y>=0&&y<n;
    }
    public static boolean searchBoard(char[][] board,String s,int index,int startx,int starty){
            if (index==s.length()-1){
                return board[startx][starty]==s.charAt(index);
            }
            if (board[startx][starty]==s.charAt(index)){
                visited[startx][starty]=true;
                for (int i=0;i<4;i++){
                    int newx=startx+d[i][0];
                    int newy=starty+d[i][1];
                    if (inArea(newx,newy,m,n)&&(!visited[newx][newy])){
                        if (searchBoard(board,s,index+1,newx,newy))
                            return true;
                    }
                }
                visited[startx][starty]=false;
            }
            return false;
    }
    public static void main(String[] args) {
        char[][] matrix=new char[m][n];
        int level=0;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                matrix[i][j]=(char)('A'+level);
                level++;
            }
        }
        System.out.println(searchBoard(matrix,"ABCD",0,0,0));
    }
}
