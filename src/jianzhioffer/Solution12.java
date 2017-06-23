package jianzhioffer;


import java.util.Stack;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution12 {

        public ListNode FindKthToTail(ListNode head,int k) {
            Stack<ListNode> stack=new Stack();
            int count=0;
            ListNode p=head;
            if (head==null||k==0){
                return null;
            }
            while(p!=null){
                stack.push(p);
                p=p.next;
                count++;
            }
            if (count<k){
                return null;
            }
            while(k>1){
                stack.pop();
                k--;
            }
            return stack.pop();
        }


}
