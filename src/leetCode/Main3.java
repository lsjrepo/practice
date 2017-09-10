package leetCode;


import java.util.*;

/**
 * leetCode 347
 * 优先队列的使用
 * 通过优先队列获取重复次数K大的前N个数
 */
public class Main3 {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        ArrayList<Integer> result=new ArrayList<>();
        Map<Integer,Integer> hashMap=new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> queue=new PriorityQueue<>((o1, o2) -> {
            if (o1.getValue()>o2.getValue()) return 1;//最小堆
            else return -1;
        });
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
            else  hashMap.put(nums[i],1);
        }
        Iterator<Map.Entry<Integer, Integer>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            if (queue.size()==k){
                if (entry.getValue()>queue.peek().getValue()){
                    queue.poll();
                    queue.offer(entry);
                }
            }
            else queue.offer(entry);
        }
        while(!queue.isEmpty()){
            result.add(queue.poll().getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] n={4,1,-1,2,-1,2,3};
        System.out.println(topKFrequent(n,2));
    }
}
