package jianzhioffer;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,
 * 他马上就写出了正确答案是100。但是他并不满足于此,
 * 他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列?
 * Good Luck!
 * 思路:
 * 分两个指针，前指针不会操作sum的一一半，
 * 考虑100的情况:1+..+50=100，如果前指针是从50开始的，那么加上的数,必定比
 * 100要大
 *
 */
public class Solution38 {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if (sum<=1) return result;
        int start=1,end=2;
        while(start<(1+sum)/2){
            int curSum=getSum(start,end);
            if (curSum==sum){
                ArrayList<Integer> arrayList=new ArrayList<>();
                for (int i=start;i<=end;i++){
                    arrayList.add(i);
                }
                result.add(arrayList);
                start++;
                end++;
            }
            else if(curSum>sum){
                start++;
            }
            else{
                end++;
            }
        }
        return result;

    }
    public  static int getSum(int start,int end){
        int sum=start;
        for (int i=start+1;i<=end;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(FindContinuousSequence(3));
    }
}
