package jianzhioffer;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个
 * 排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Solution23 {
    public TreeNode Convert(TreeNode pRootOfTree) {
            if (pRootOfTree==null){
                return null;
            }
            //递归的结束条件
            if (pRootOfTree.left==null&&pRootOfTree.right==null){
                return pRootOfTree;
            }
            TreeNode left=Convert(pRootOfTree.left);//左子树的根节点
            TreeNode p=left;
            //找到左子树的最右侧的节点
            while(p!=null&&p.right!=null){
                p=p.right;
            }
            if (left!=null){
                p.right=pRootOfTree;
                pRootOfTree.left=p;
            }
            //将右子树转化为双向链表
            TreeNode right=Convert(pRootOfTree.right);
            if (right!=null){
                right.left=pRootOfTree;
                pRootOfTree.right=right;
            }
            return left!=null?left:pRootOfTree;
    }
}
