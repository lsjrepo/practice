package shujujiegou;

import java.util.Stack;

/**
 * Created by lsj on 17-4-5.
 * 请编写一个函数，检查链表是否为回文。
 给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
 测试样例：
 {1,2,3,2,1}
 返回：true
 {1,2,3,2,3}
 返回：false
 */

public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        ListNode p=pHead;
        Stack<ListNode> ss=new Stack<ListNode>();
        while(p!=null){
            ss.push(p);
            p=p.next;
        }
        p=pHead;
        while(p!=null){
            if(ss.pop().val!=p.val){

                return false;
            }
            p=p.next;
        }
        return true;
    }
}
