package wangyi;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by lsj on 17-9-16.
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        Stack<Character> stack=new Stack<>();
        int n=sin.nextInt();
        String s=sin.next();
        if (s.length()==3){
            System.out.println(s.charAt(1)+""+s.charAt(2)+s.charAt(0));
            System.out.printf("%s",s.charAt(2)+""+s.charAt(1)+s.charAt(0));
        }
        if (s.length()==1){
            System.out.println(s.charAt(0)+"");
        }
        if (s.length()==2){
            System.out.println(s.charAt(1)+""+s.charAt(0));
        }
    }
}
