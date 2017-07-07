package jianzhioffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，
 * 请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution25 {
    public static  int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=1;
        for (int i=0;i<array.length;i++){
            if (!map.containsValue(array[i])){//元素第一次出现
                count=1;
                map.put(count,array[i]);
            }
           map.put(++count,array[i]);

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

    public static void main(String[] args) {
        int[] a={1,2,2,2,5,4,2};
        MoreThanHalfNum_Solution(a);
    }
}
