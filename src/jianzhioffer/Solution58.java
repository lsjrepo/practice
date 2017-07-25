package jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 如何得到一个数据流中的中位数？
 * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 */
public class Solution58 {
    //low的解法
   /* ArrayList<Integer> list=new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
        Collections.sort(list);
    }

    public Double GetMedian() {
        int mid=(list.size())/2;
            if (list.size()%2==0){//偶数

                return Double.valueOf((Double.valueOf(list.get(mid))+Double.valueOf(list.get(mid-1)))/2);
            }
            else{
                return Double.valueOf(list.get(mid));
            }
    }*/
   int count=0;
   PriorityQueue<Integer> minQ=new PriorityQueue<>();
   PriorityQueue<Integer> maxQ=new PriorityQueue<>(20,new Comparator<Integer>() {
       @Override
       public int compare(Integer o1, Integer o2) {
           return (o2-o1);
       }
   });
    public void Insert(Integer num) {
        if (count%2==0){
            maxQ.offer(num);
            int max=maxQ.poll();//得到堆中的最大值
            minQ.offer(max);
        }
        else{
            minQ.offer(num);
            int min=minQ.poll();
            maxQ.offer(min);
        }
        count++;
    }

    public Double GetMedian() {
        if (count%2==0){
            return (Double.valueOf(maxQ.peek())+Double.valueOf(minQ.peek()))/2;
        }
        else{
            return Double.valueOf(minQ.peek());
        }
    }
}
