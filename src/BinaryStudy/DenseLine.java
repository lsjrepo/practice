package BinaryStudy;

import org.omg.PortableServer.POA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lsj on 17-4-23.
 *
 在二维平面上，有一些点，请找出经过点数最多的那条线。
 给定一个点集vector p和点集的大小n,没有两个点的横坐标相等的情况,
 请返回一个vector，
 代表经过点数最多的那条直线的斜率和截距。
 思路:直接暴力求解,求出所有的斜率以及斜率对应的点
 然后遍历map求出map中最大arraylist对应的那个key
 由y=kx+b
 求出b的值
 */

public class DenseLine {
    public double[] getLine(Point[] p, int n) {
        // write code here

        double[] result=new double[2];
        Map<Double,ArrayList<Point>> mm=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double k=(p[j].y-p[i].y)/(p[j].x-p[i].x);
                if (!mm.containsKey(k)){//不同的斜率
                    ArrayList<Point> a=new ArrayList<>();//新建一个ArrayList
                    a.add(p[i]);
                    a.add(p[j]);
                    mm.put(k,a);

                }
                else{
                    ArrayList<Point> a=mm.get(k);
                    if (!a.contains(p[i])){
                        a.add(p[i]);
                    }
                    if(!a.contains(p[j])){
                        a.add(p[j]);
                    }
                }
            }
        }
        for(Map.Entry<Double,ArrayList<Point>> entry:mm.entrySet()){
            int max=0;
            if(entry.getValue().size()>max){
                max=entry.getValue().size();
                result[0]=entry.getKey();
            }

        }
        ArrayList<Point> pp=mm.get(result[0]);
        result[1]=pp.get(0).y-result[0]*pp.get(0).x;
        return result;
    }
}