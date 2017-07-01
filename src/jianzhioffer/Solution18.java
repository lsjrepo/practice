package jianzhioffer;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class Solution18 {
    Stack<Integer> data=new Stack<>();
    Stack<Integer> min=new Stack<>();
    Integer temp=null;

    public void push(int node) {
        if (temp!=null){
            if (node<=temp){//下一个数只有小才会被push进来
                temp=node;
                min.push(node);
            }
            data.push(node);
        }
        else{
            temp=node;//第一次
            data.push(node);
            min.push(node);
        }
    }

    public void pop() {
       int num1=data.pop();
       int num2=min.pop();
       if (num1!=num2){
           min.push(num2);
       }
    }

    public int top() {

        return data.peek();

    }

    public int min() {

        return min.peek();
    }
}
