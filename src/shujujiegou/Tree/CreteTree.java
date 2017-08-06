package shujujiegou.Tree;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 创建二叉树
 */
public class CreteTree {
    public static TreeNode createTree(int[] a,int len,int index){
        if (index>=len){
            return null;
        }
        TreeNode node=new TreeNode(a[index]);
        node.left=createTree(a,len,2*index+1);
        node.right=createTree(a,len,2*index+2);
        return node;
    }
    public static void main(String[] args) {
        int[] a={1,5,34,56,45,67,88};
        TreeNode root=createTree(a,a.length,0);
    }
}
