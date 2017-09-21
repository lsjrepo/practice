package leetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1.Two Sum
 */
public class Main09 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<nums.length;i++){
           if (hashMap.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=hashMap.get(target-nums[i]);
                return result;
           }
           hashMap.put(nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] r=twoSum(a,5);
        for (int i=0;i<r.length;i++){
            System.out.println(r[i]);
        }
    }
}
