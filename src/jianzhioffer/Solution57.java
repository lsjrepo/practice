package jianzhioffer;

import java.util.Stack;

/**
 给定一颗二叉搜索树，请找出其中的第k大的结点。例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
 */
public class Solution57 {
    int count=0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
            if (pRoot!=null){

            TreeNode node= KthNode(pRoot.left,k);
            if (node!=null){
                return node;
            }
            count++;
            if (count==k){
                return pRoot;
            }
            TreeNode node1=KthNode(pRoot.right,k);
            if (node1!=null){
                return node1;
            }

            }
            return null;
    }
}
