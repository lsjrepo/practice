package shujujiegou.Tree;

import java.util.ArrayList;

/**
 * Created by lsj on 17-4-10.
 *

 请实现一个函数，检查一棵二叉树是否为二叉查找树。

 给定树的根结点指针TreeNode* root，请返回一个bool，
 代表该树是否为二叉查找树。

 * 思路:
 * 中序遍历二叉查找树可以得到一个递增的序列
 */
public class Checker {

public boolean checkBST(TreeNode root) {
    if(Inorder(root)!=null) return false;
        return true;
    }
        TreeNode pre = null;
        public TreeNode Inorder(TreeNode root){
            if(root==null) return null;
            TreeNode left=Inorder(root.left);
            if(left!=null) return left;
            if(pre!=null&&pre.val>root.val)
                return root;
            pre = root;
            TreeNode right=Inorder(root.right);
            if(right!=null) return right;
            return null;
        }
}
