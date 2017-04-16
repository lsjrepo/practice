package BinaryStudy;

/**
 * Created by lsj on 17-4-16.
 *

 在二维平面上，有两个正方形，请找出一条直线，
 能够将这两个正方形对半分。假定正方形的上下两条边与x轴平行。

 给定两个vecotrA和B，分别为两个正方形的四个顶点。
 请返回一个vector，代表所求的平分直线的斜率和截距，保证斜率存在。
 测试样例：

 [(0,0),(0,1),(1,1),(1,0)],[(1,0),(1,1),(2,0),(2,1)]

 返回：[0.0，0.5]


 */
 class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }
}
public class Bipartition {
    public double[] getBipartition(Point[] A, Point[] B) {
        // write code here
        int centerx1=(A[0].x+A[2].x)/2;
        int centery1=(A[0].y+A[2].y)/2;
        int centerx2=(A[0].x+A[3].x)/2;
        int centery2=(A[0].y+A[3].y)/2;
        double[] result=new  double[2];
        result[0]=(centery1-centery2)/(centerx2-centerx1);
        result[1]=(centery2*centerx1-centery1*centerx2)/(centerx1-centerx2);
        return result;
    }


}
