package BinaryStudy;

/**
 * Created by lsj on 17-4-14.
 *
 *

 编写一个函数，确定需要改变几个位，才能将整数A转变成整数B。

 给定两个整数int A，int B。请返回需要改变的数位个数。
 测试样例：

 10,5

 返回：4


 */
public class Transform {
    public static  int calcCost(int A, int B) {
        // write code here
        int rest=A^B;
        int count=0;
        while(rest!=0){
            if((rest&1)!=0)
            {
                count++;
            }

            rest>>=1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(calcCost(10,5));
    }
}
