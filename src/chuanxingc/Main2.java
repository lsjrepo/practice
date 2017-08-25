package chuanxingc;

import java.util.*;

/**
 * 给定一字符串只包含数字，请写一个算法，找出该字符串中的最长不重复子串（不重复是指子串中每一元素不同于子串中其他元素）
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        String str=sin.next();
        StringBuilder sb=new StringBuilder();
        Map<Character,Integer> hashMap=new HashMap<>();
        List<StringBuilder> arrayList=new ArrayList<>();
        for(int i=0;i< str.length();i++){
            if (!hashMap.containsKey(str.charAt(i))){
                hashMap.put(str.charAt(i),1);
                sb.append(str.charAt(i));
            }
            else{
                arrayList.add(sb);
                hashMap.clear();
                hashMap.put(str.charAt(i),1);
                sb=new StringBuilder();
                sb.append(str.charAt(i));
            }

        }
        arrayList.add(sb);
        Collections.sort(arrayList, (o1, o2) -> {
            if (o1.length()>o2.length()){
                return -1;
            }
            else{
                return 1;
            }
        });
        System.out.println(arrayList.get(0).toString());
    }
}
