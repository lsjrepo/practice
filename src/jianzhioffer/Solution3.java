package jianzhioffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by lsj on 17-6-19.
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> resultArrayList=new ArrayList<>();
        if (listNode==null){
            return resultArrayList;
        }
        Stack<Integer> stack=new Stack<>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        while(!stack.empty()){
            resultArrayList.add(stack.pop());
        }
        return resultArrayList;
    }
}
