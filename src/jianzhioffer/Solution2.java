package jianzhioffer;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为
 * We%20Are%20Happy
 */
public class Solution2 {
    public static String replaceSpace(StringBuffer str) {
        /*String s=str.toString();*/
        return str.toString().replaceAll("\\s","%20");

    }

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("We Are Happy");
        String result=replaceSpace(sb);
        System.out.println(result);
    }
}
