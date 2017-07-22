package jianzhioffer;

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 */
public class Solution44 {
    public int StrToInt(String str) {
        if (str.equals("")||str==null){
            return 0;
        }
        char[] c=str.toCharArray();
        int start=0;
        int sum=0;
        if (c[0]=='-'){
            start=1;
        }
        for (int i=start;i<str.length();i++){
            if(c[i]=='+'){
                continue;
            }
            if (c[i]>57||c[i]<48){
                return 0;
            }

            sum=sum*10+(c[i]-48);
        }
        return (start==0)?sum:sum*-1;
    }
}

