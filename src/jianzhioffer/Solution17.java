package jianzhioffer;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，
 * 如果输入如下矩阵：1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字
 * 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Solution17 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();
        if (matrix.length==0){
            return result;
        }
        int rows=matrix.length;//行
        int columns=matrix[0].length;//列
        int circle=(Math.min(rows,columns)-1)/2+1;
         for (int i=0;i<circle;i++){
             //从左往右
             for(int k=i;k<columns-i;k++){
                 result.add(matrix[i][k]);
             }
             //右上往右下
             for (int j=i+1;j<rows-i;j++){
                 result.add(matrix[j][columns-i-1]);
             }
             //右左
             for(int k=columns-i-2;(k>=i)&&(rows-i-1!=i);k--) result.add(matrix[rows-i-1][k]);//右至左
             for(int j=rows-i-2;(j>i)&&(columns-i-1!=i);j--) result.add(matrix[j][i]);//左下至左上
         }
        return result;
    }

}
