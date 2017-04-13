package BinaryStudy;

/**
 *  Created by lsj on 17-4-13.
 *  有一个介于0和1之间的实数，类型为double，返回它的二进制表示。如果该数字无法精确地用32位以内的二进制表示，返回“Error”。
    给定一个double num，表示0到1的实数，请返回一个string，代表该数的二进制表示或者“Error”。
    测试样例：
    0.625
    返回：0.101
    小发现:
    二进制小数的最后一个一定是1??
 */
public class BinDecimal {
    public static  String printBin(double num) {
        // write code here
        StringBuilder sb=new StringBuilder("0.");
        while(num!=1){
            num*=2;
            if(num>1){
                num-=1;
                sb.append("1");
            }
            else if (num<1){
                sb.append("0");
            }

        }
        sb.append("1");
        if (sb.length()>32){
            return "Error";
        }
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(printBin(0.125));
    }

}
