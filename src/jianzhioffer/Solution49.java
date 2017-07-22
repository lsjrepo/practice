package jianzhioffer;

import java.util.*;

/**
 * 请实现一个函数用来找出字符流中第一个只出
 * 现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，
 * 第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，
 * 第一个只出现一次的字符是"l"。
 */
public class Solution49 {
    //Insert one char from stringstream
    Map<Character,Integer> map=new HashMap<>();
    ArrayList<Character> arrayList=new ArrayList<>();
    public void Insert(char ch)
    {
        if (map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
        arrayList.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for (int i=0;i<arrayList.size();i++){
            if (map.get(arrayList.get(i))==1){
                return arrayList.get(i);

            }
        }
        return '#';
    }
}
