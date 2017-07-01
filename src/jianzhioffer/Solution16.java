package jianzhioffer;

import sun.reflect.generics.tree.Tree;

/**
 * Created by lsj on 17-6-24.
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 *二叉树的镜像定义：源二叉树
   8
 /   \
 6    10
 / \  / \
 5  7 9 11
 镜像二叉树
   8
 /   \
 10   6
 / \  / \
 11 9 7  5
 */
public class Solution16 {
    public void Mirror(TreeNode root) {
        TreeNode temp;
        if (root==null){
            return ;
        }
         temp=root.left;
         root.left=root.right;
          root.right=temp;
          if (root.left!=null){
              Mirror(root.left);
          }
          if (root.right!=null){
              Mirror(root.right);
          }
    }

}
