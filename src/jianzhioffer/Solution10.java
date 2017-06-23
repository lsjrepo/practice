package jianzhioffer;

/**
 * Created by Administrator on 2017/6/23.
 * 给定一个double类型的浮点数base和int类型的整数exponent求base的exponent次方。
 */
public class Solution10 {
    public double Power(double base, int exponent) {
        double result=1.0;
        for(int i=0;i<Math.abs(exponent);i++){
            result*=base;
        }
        if (exponent>0){
            return result;
        }
        return (1/result);
    }

}
