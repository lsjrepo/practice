package shujujiegou;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by lsj on 17-4-5.
 *
 请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），要求最多只能使用一个额外的栈存放临时数据，
 但不得将元素复制到别的数据结构中。
 给定一个int[] numbers(C++中为vector&ltint>)，其中第一个元素为栈顶，请返回排序后的栈。
 请注意这是一个栈，意味着排序过程中你只能访问到第一个元素。
 测试样例：
 [1,2,3,4,5]
 返回：[5,4,3,2,1]
 */
public class TwoStacks {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        Stack<Integer> temp=new Stack<Integer>();//temp1只是用来临时存放
        Stack<Integer> temp2=new Stack<Integer>();//temp2用来存放排序后的数据
        ArrayList<Integer> result=new ArrayList<Integer>();

        for(int i=0;i<numbers.length-1;i++){
            temp.push(numbers[i]);

        }
        temp2.push(numbers[numbers.length-1]);
        int top=0;
        while(!temp.isEmpty()){
            if(temp.peek()>=temp2.peek()){
                temp2.push(temp.pop());
            }
            else{
                top=temp.pop();
                int nums=temp.size();
                while(!temp2.isEmpty()&&top<temp2.peek()){
                    temp.push(temp2.pop());
                }
                temp2.push(top);
                int count=temp.size()-nums;
                for (int i=0;i<count;i++){
                    temp2.push(temp.pop());
                }
                /*temp2.push(top);*/

            }
        }
        for (int i=0;i<numbers.length;i++){
            result.add(temp2.pop());
        }
        return result;
    }
}
