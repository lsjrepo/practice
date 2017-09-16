package wangyi;



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 一个合法的括号匹配序列被定义为:
 1. 空串""是合法的括号序列
 2. 如果"X"和"Y"是合法的序列,那么"XY"也是一个合法的括号序列
 3. 如果"X"是一个合法的序列,那么"(X)"也是一个合法的括号序列
 4. 每个合法的括号序列都可以由上面的规则生成
 例如"", "()", "()()()", "(()())", "(((()))"都是合法的。
 从一个字符串S中移除零个或者多个字符得到的序列称为S的子序列。
 例如"abcde"的子序列有"abe","","abcde"等。
 定义LCS(S,T)为字符串S和字符串T最长公共子序列的长度,即一个最长的序列W既是S的子序列也是T的子序列的长度。
 小易给出一个合法的括号匹配序列s,小易希望你能找出具有以下特征的括号序列t:
 1、t跟s不同,但是长度相同
 2、t也是一个合法的括号匹配序列
 3、LCS(s, t)是满足上述两个条件的t中最大的
 因为这样的t可能存在多个,小易需要你计算出满足条件的t有多少个。

 如样例所示: s = "(())()",跟字符串s长度相同的合法括号匹配序列有:
 "()(())", "((()))", "()()()", "(()())",其中LCS( "(())()", "()(())" )为4,其他三个都为5,所以输出3.
 输入描述:

 输入包括字符串s(4 ≤ |s| ≤ 50,|s|表示字符串长度),保证s是一个合法的括号匹配序列。
 *
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        String s=sin.next();
        System.out.println(count(s));

    }
    public static int count(String s){
        Set<String> hashSet=new HashSet<>();
        for (int i=0;i<s.length();i++){
            String temp=s.substring(0,i)+s.substring(i+1);//temp中去除了第i个元素
            for (int j=0;j<s.length()-1;j++){
                String u=temp.substring(0,j)+s.charAt(i)+temp.substring(j);
                int tmp=0;
                for (int k=0;k<s.length();k++){
                    tmp+=(u.charAt(k)=='('?1:-1);
                    if (tmp<0){
                        break;
                    }
                }
                if (tmp>=0){
                    hashSet.add(u);
                }

            }
        }
        return hashSet.size()-1;
    }

}
