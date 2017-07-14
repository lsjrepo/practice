package jianzhioffer;

/**
 * 入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class Solution36 {
    public boolean flag=true;
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null){
            return true;
        }
        return flag;
    }
    public int getDepth(TreeNode root){
            if (root==null){
                return 0;
            }
            int left=getDepth(root.left);
            int right=getDepth(root.right);
            if (Math.abs(left-right)>1){
                flag=false;
            }
            return left>right?left+1:right+1;
    }
}
