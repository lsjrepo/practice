package jianzhioffer;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class Solution53 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot==null){
            return true;
        }
        return judge( pRoot.left, pRoot.right);
    }
    public boolean judge(TreeNode right,TreeNode left){
        if (right==null&&left==null){//左右相等
            return true;
        }
        if (left==null||right==null){//左右有一部分先为空了
            return false;
        }
        if (right.val==left.val){
            return judge(right.left,left.right)&&judge(right.right,left.left);
        }
        return false;

    }
}
