package jianzhioffer;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Solution43 {
    public int Add(int num1,int num2) {
        int n1=num1;
        int n2=num2;
        n1=(n1&n2)<<1;//得到所有的进位位
        n2=(num2^num1);
        while((n1&n2)!=0){
            num1=n1;
            num2=n2;
            n1=(n1&n2)<<1;//得到所有的进位位
            n2=(num2^num1);
        }
        return n1|n2;
    }
}
