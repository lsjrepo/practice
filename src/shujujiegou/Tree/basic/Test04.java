/*
package shujujiegou.Tree.basic;

import java.util.ArrayList;
import java.util.List;

*/
/**
 * N皇后问题
 *//*

public class Test04 {
    private static int N;
    private static List<List<String>> result;
    private static Boolean[] col=new Boolean[N];
    private static Boolean[] dia1=new Boolean[2*N-1];
    private static Boolean[] dia2=new Boolean[2*N-1];
    public static void putQueen(int n,int index,List<Integer> row){//index表示行号,row表示存放的一组解
            if (index==n){//
                result.add(generateBoard(n,row));
                return;
            }
            for (int i=0;i<n;i++){//i表示列号
                if (!col[i] &&!dia1[index+i]&&!dia2[index-i+n-1]){//尝试将index行的皇后摆放在i列
                    row.add(i);
                    col[i]=true;
                    dia1[index+i]=true;
                    dia2[index-i+n-1]=true;
                    putQueen(n,index+1,row);
                    col[i]=false;
                    dia1[index+i]=false;
                    dia2[index-i+n-1]=false;
                    row.remove(row.size()-1);
                }
            }
    }

    private static List<String> generateBoard(int n, List<Integer> row) {

    }

    public static List<List<String>> solveNQueens(int n) {
            result.clear();
            List<Integer> row=new ArrayList<>();
            putQueen(n,0,row);//从第0行开始
            return result;
    }

    public static void main(String[] args) {
        N=8;

    }
}
*/
