package jianzhioffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/**
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
public class Solution31 {
    public static int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        char[] c=str.toCharArray();
        int count=1;
        for(int i=0;i<c.length;i++){
            if (map.containsKey(c[i])){
                map.put(c[i],++count);
            }
            else
            {
                map.put(c[i],1);
            }

        }
        for (int i=0;i<c.length;i++){
            if (1==map.get(c[i])){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("abbvcxa"));
    }
}
