package leetCode;

import java.util.Stack;

/**
 * 逆波兰数
 */
public class Main {
    public static int evalRPN(String[] tokens) {
        Stack<String> stack=new Stack<>();
        for (int i=0;i<tokens.length;i++){
            if (tokens[i].equals("+")){
                String s1=stack.pop();
                String s2=stack.pop();
                stack.push(Integer.valueOf(s2)+Integer.valueOf(s1)+"");

            }
            else if (tokens[i].equals("*")){
                String s1=stack.pop();
                String s2=stack.pop();
                stack.push(Integer.valueOf(s2)*Integer.valueOf(s1)+"");

            }
            else if (tokens[i].equals("-")){
                String s1=stack.pop();
                String s2=stack.pop();
                stack.push(Integer.valueOf(s2)-Integer.valueOf(s1)+"");

            }
            else if (tokens[i].equals("/")){
                String s1=stack.pop();
                String s2=stack.pop();
                stack.push(Integer.valueOf(s2)/Integer.valueOf(s1)+"");

            }
            else stack.push(tokens[i]);

        }
        return Integer.valueOf(stack.peek());
    }

    public static void main(String[] args) {
        String[] s={"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(s));
    }
}
