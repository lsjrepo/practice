package jianzhioffer;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution20 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        ArrayList<TreeNode> treeNodes=new ArrayList<>();
        if (root==null){
            return result;
        }
        treeNodes.add(root);
        result.add(root.val);
        for (int i=0;i<treeNodes.size();i++){
            TreeNode node=treeNodes.get(i);
            if (node.left!=null){
                treeNodes.add(node.left);
                result.add(node.left.val);
            }
            if (node.right!=null){
                treeNodes.add(node.right);
                result.add(node.right.val);
            }
        }
        return result;
    }
}
