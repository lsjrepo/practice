package jianzhioffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
public class Solution25{
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=1;
        for (int i=0;i<array.length;i++){
            if (!map.containsValue(array[i])){//元素第一次出现
                count=1;
                map.put(count,array[i]);
            }
            else{
                map.put(++count,array[i]);
            }
        }
        Set<Integer> set = map.keySet();
        Object[] obj = set.toArray();
        Arrays.sort(obj);
        if ((int)obj[obj.length-1]>(array.length/2)){
            return map.get((int)obj[obj.length-1]);
        }
        else{
            return 0;
        }
    }
}