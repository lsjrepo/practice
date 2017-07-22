package jianzhioffer;

/**
 * 一个链表中包含环，
 * 请找出该链表的环的入口结点。
 */
public class Solution50 {
    public ListNode findMeetingNode(ListNode node){
        if (node==null){
            return null;
        }
        ListNode slow=node.next;
        if (slow==null){
            return null;
        }
        ListNode fast=slow.next;
        while(slow!=null&&fast!=null){//慢指针走一部，快指针走两部
            if (slow==fast){
                return fast;
            }
            slow=slow.next;
            fast=fast.next;
            if (fast!=slow){
                fast=fast.next;
            }
        }
        return null;


    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
       ListNode mNode=findMeetingNode(pHead);//找到相遇的指针
       if (mNode==null){
           return null;
       }
       int count=1;
       ListNode p1=mNode;
       while(p1.next!=mNode){
           p1=p1.next;
           ++count;
       }//得到环的大小
       p1=pHead;
       while(count!=0){
           p1=p1.next;
           count--;
       }
       ListNode p2=pHead;
       while(p2!=p1){
           p2=p2.next;
           p1=p1.next;
       }
       return p1;
    }
}
