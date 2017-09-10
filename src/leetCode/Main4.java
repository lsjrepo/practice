package leetCode;

/**
 * leetCode 75
 * 计数排序
 */
public class Main4 {
    public void sortColours(int[] nums){
        int[] count=new int[3];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int index=0;

        for(int i=0;i<count[0];i++){
            nums[index++]=0;
        }
        for (int i=0;i<count[1];i++){
            nums[index++]=1;
        }
        for (int i=0;i<count[2];i++){
            nums[index++]=2;
        }
    }
}
