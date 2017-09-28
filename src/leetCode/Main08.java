package leetCode;

/**
 * Created by lsj on 17-9-27.
 * 206. Reverse Linked List
 */

 class ListNode {
    int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}