package jianzhioffer;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class Solution33 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1=pHead1;
        ListNode p2=pHead2;
        int length1=getListLength(pHead1);
        int length2=getListLength(pHead2);
        if (length1<length2){
            p2=go4severalsteps(p2,length2-length1);
        }
        else{
            p1=go4severalsteps(p1,length1-length2);
        }
        while(p1!=null&&p2!=null){
            if (p1==p2) return p1;
            p1=p1.next;
            p2=p2.next;
        }
        return null;

    }
    public int getListLength(ListNode pHead){
        if (pHead==null) return 0;
        int count=0;
        ListNode p=pHead;
        while(p!=null){
            p=p.next;
            count++;
        }
        return count;
    }
    public ListNode go4severalsteps(ListNode listNode,int i){
        while(i>0){
            listNode=listNode.next;
            i--;
        }
        return listNode;
    }
}
