package jianzhioffer;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Solution51 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode newNode=new ListNode(-1);
        newNode.next=pHead;
        ListNode p=pHead;
        ListNode p1=newNode;
        while(p!=null&&p.next!=null){
            if (p.val==p.next.val){
                int val=p.val;
                while(p!=null&&p.val==val){
                    p=p.next;
                }
                p1.next=p;
            }
            else{

                p1=p;
                p=p.next;

            }

        }
        return newNode.next;
    }

}
