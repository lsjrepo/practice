package BinaryStudy;

/**
 * Created by lsj on 17-4-13.
 *

 有一个正整数，请找出其二进制表示中1的个数相同、
 且大小最接近的那两个数。(一个略大，一个略小)

 给定正整数int x，请返回一个vector，代表所求的两个数（小的在前）。
 保证答案存在。
 测试样例：

 2

 返回：[1,4]

问题:15这类数貌似无解。。。

 */
public class CloseNumber {
    public static int count(int x){
        int count=0;
        while (x!=0){
            if((x&1)==1){
                count++;

            }
            x=x>>1;
        }
        return count;
    }
    public static int[] getCloseNumber(int x) {
        // write code here
           int[] temp=new int[2];
            int big=x+1;
            int small=x-1;
            int num=count(x);//获得x中所有1的个数
            while(small>0){
                if(num==count(small))
                {
                    break;
                }
                small--;
            }
            while(true){
                if (num==count(big)){
                    break;
                }
                big++;
            }
            temp[0]=small;
            temp[1]=big;
            return temp
                    ;
    }
    public static void main(String[] args){
        System.out.println(getCloseNumber(15)[0]);
    }
}
