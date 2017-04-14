package BinaryStudy;

/**
 * Created by lsj on 17-4-14.
 *

 请编写程序交换一个数的二进制的奇数位和偶数位。（使用越少的指令越好）

 给定一个int x，请返回交换后的数int。
 测试样例：

 10

 返回：5


 */
public class Exchange {
    public static int exchangeOddEven(int x) {
        // write code here
        int z=x&0xAAAAAAAA;
        int y=x&0x55555555;
        return ((z>>1)+(y<<1));
    }

    public static void main(String[] args) {
        System.out.println(exchangeOddEven(10));
    }
}
