package jianzhioffer;


import jianzhioffer.tools.RandomListNode;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，
 * 一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Solution22 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        cloneNodes(pHead);
        ConnectRandomNodes(pHead);
        return ReConnectNodes(pHead);
    }

    //先复制节点,不管random指针
    public static void cloneNodes(RandomListNode pHead){
        RandomListNode pNode=pHead;
        while(pNode!=null){
            RandomListNode pCloned=new RandomListNode(0);
            pCloned.label=pNode.label;
            pCloned.next=pNode.next;
            pCloned.random=null;
            pNode.next=pCloned;
            pNode=pCloned.next;//指向下一个节点,重新开始循环
        }
    }
    //random指针建立关系
    public void ConnectRandomNodes(RandomListNode pHead){
        RandomListNode pNode=pHead;
        while(pNode!=null){
            RandomListNode pCloned= pNode.next;
            if (pNode.random!=null){
                pCloned.random=pNode.random.next;
            }
            pNode=pCloned.next;
        }
    }
    //拆分链表
    public static RandomListNode ReConnectNodes(RandomListNode pHead){
            RandomListNode pNode=pHead;
            RandomListNode pClonedHead=null;
            RandomListNode pClonedNode=null;
            if (pNode!=null){
                pClonedHead=pClonedNode=pNode.next;
                pNode.next=pClonedNode.next;
                pNode=pNode.next;
            }
            while(pNode!=null){
                pClonedNode.next=pNode.next;
                pClonedNode=pClonedNode.next;
                pNode.next=pClonedNode.next;
                pNode=pNode.next;
            }
            return pClonedHead;
    }
}