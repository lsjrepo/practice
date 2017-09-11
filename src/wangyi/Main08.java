package wangyi;

import java.util.Scanner;
import java.util.Stack;

/**
 小易准备去魔法王国采购魔法神器,购买魔法神器需要使用魔法币,但是小易现在一枚魔法币都没有,
 但是小易有两台魔法机器可以通过投入x(x可以为0)个魔法币产生更多的魔法币。
 魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
 魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
 小易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法机器产生恰好n个魔法币,
 小易需要你帮他设计一个投入方案使他最后恰好拥有n个魔法币。
 输入描述:
 输入包括一行,包括一个正整数n(1 ≤ n ≤ 10^9),表示小易需要的魔法币数量。
 */
public class Main08 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        System.out.println(getCoin(n));
    }
    public static String getCoin(int n){
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        while(n!=0){
            if (n%2==0){
                stack.push('2');
                n=(n-2)/2;
            }
            else{
                stack.push('1');
                n=(n-1)/2;
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();

    }

}
