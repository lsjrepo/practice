package wangyi;

import java.util.Scanner;

/**
 * 小易为了向他的父母表现他已经长大独立了,
 * 他决定搬出去自己居住一段时间。一个人生活增加了许多花费:
 * 小易每天必须吃一个水果并且需要每天支付x元的房屋租金。
 * 当前小易手中已经有f个水果和d元钱,小易也能去商店购买一些水果,
 * 商店每个水果售卖p元。小易为了表现他独立生活的能力,
 * 希望能独立生活的时间越长越好,
 * 小易希望你来帮他计算一下他最多能独立生活多少天。
 */
    public class Main {

    public static void main(String[] args) {

        Scanner sin=new Scanner(System.in);

        int x=sin.nextInt();//房屋租金
        int f=sin.nextInt();//已有的水果个数
        int d=sin.nextInt();//余额
        int p=sin.nextInt();//每一个水果的价钱
        int temp=(d/x);
        if (temp<=f){//不用买水果了
            System.out.println(temp);
        }
        else{
            d-=f*x;
            System.out.println(f+d/(x+p));
        }


    }


}
