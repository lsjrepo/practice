package shujujiegou.Tree.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * N皇后问题
 */
public class Test04 {
    public static void putQueen(char[][] board,int index,List<List<String>> res){//index表示行号,row表示存放的一组解
            if (index==board.length){//递归截止条件
                res.add(generateBoard(board));
                return;
            }
            for (int i=0;i<board.length;i++){
                if (validate(board,i,index)){
                    board[i][index]='Q';
                    putQueen(board,index+1,res);
                    board[i][index]='.';//回溯,返回原来的状态
                }
            }
    }
    public static boolean validate(char[][] board,int x,int y){
        for (int i=0;i<board.length;i++){//列
            for (int j=0;j<y;j++){//行
                if (board[i][j]=='Q'&&((x-y==i-j)||(x+y==i+j)||(x==i))){//ij这个位置上有皇后，并且i,j这个位置在对角线并且同列
                    return false;
                }
            }
        }
        return true;
    }
    public static List<String> generateBoard(char[][] board){
        List<String> res=new LinkedList<>();
        for (int i=0;i<board.length;i++){
            String s=new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public static List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> res=new ArrayList<>();
        putQueen(board,0,res);//从第0行开始
        return res;
    }

    public static void main(String[] args) {
        List<List<String>> result=solveNQueens(4);
        for(List list:result){
            System.out.println(list);
        }
    }
}
