package jianzhioffer;

/**
 * 给定一个二叉树和其中的一个结点，
 * 请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，
 * 同时包含指向父结点的指针。
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;
    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class Solution52 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode==null){
            return null;
        }
        //该节点有右孩子
        if (pNode.right!=null){
            TreeLinkNode temp=pNode.right;
            while(temp.left!=null){
                temp=temp.left;
            }
            return temp;//一直找到最左的节点
        }
        //该节点不是根节点
        while(pNode.next!=null){
           TreeLinkNode father=pNode.next;
           if (father.left==pNode){
               return father;
           }
           pNode=pNode.next;
        }
        return null;
    }
}
