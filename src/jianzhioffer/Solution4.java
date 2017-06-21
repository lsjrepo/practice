package jianzhioffer;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入
 * 前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Solution4 {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
            if (pre.length!=in.length||pre.length==0||in.length==0){
                return null;
            }
           TreeNode treeNode=new TreeNode(pre[0]);
            int i=0;
            while(true){
                if (in[i]==pre[0]){
                    break;
                }
                i++;
            }
            int[] preLeft=new int[i];
            int[] preRight=new int[pre.length-1-i];
            int[] inLeft=new int[i];
            int[] inRight=new int[pre.length-i-1];
            for(int j=0;j<in.length;j++){
                if(j<i){
                 preLeft[j]=pre[j+1];
                 inLeft[j]=in[j];
                }
                else if (j>i){
                    preRight[j-i-1]=pre[j];
                    inRight[j-i-1]=in[j];
                }
            }
            treeNode.left=reConstructBinaryTree(preLeft,inLeft);
            treeNode.right=reConstructBinaryTree(preRight,inRight);
            return treeNode;
    }
}
