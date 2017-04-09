package shujujiegou.Tree;

/**
 * Created by lsj on 17-4-7.
 *
 实现一个函数，检查二叉树是否平衡，平衡的定义如下，对于树中的任意一个结点，
 其两颗子树的高度差不超过1。
 给定指向树根结点的指针TreeNode* root，
 请返回一个bool，代表这棵树是否平衡。

 */

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        else{
            int left=getDeep(root.left);
            int right=getDeep(root.right);
            if (Math.abs(left-right)<=1){
                return isBalance(root.left)&&isBalance(root.right);

            }
            else{
                return false;
            }
        }

    }
    public static int getDeep(TreeNode root){
        if(root!=null){
            int left=getDeep(root.left);
            int right=getDeep(root.right);
            return left>right?left+1:right+1;
        }
        else{
            return 0;
        }
    }
}