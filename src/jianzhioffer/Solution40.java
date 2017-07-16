package jianzhioffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 汇编语言中有一种移位指令叫做循环左移（ROL），
 * 现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
 * 即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class Solution40 {
    public static String LeftRotateString(String str,int n) {
        String result="";
        if (str==null||str.length()==0){
                  return result;
        }
        int position=n%str.length();
        String l=str.substring(position);
        String b=str.substring(0,position);
        result=l+b;
        return result;

    }

    public static void main(String[] args) {
        String s="XYZdefabc";
        System.out.println(LeftRotateString(s,10));
    }
}
