package shujujiegou.Tree.basic;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;
     TreeNode(int val) {
        this.val = val;
    }
}

public class Test  {
    public void swap(TreeNode left,TreeNode right){
        TreeNode temp=left;
        left=right;
        right=temp;
    }
    /**
     * 获取二叉树的最大深度
     */
    public int maxDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        int maxLeft=maxDepth(root.left);
        int maxRight=maxDepth(root.right);
        return Math.max(maxLeft,maxRight);
    }
    /**
     * 反转二叉树
     */
    public TreeNode invertTree(TreeNode root){
        if (root==null){
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        swap(root.left,root.right);
        return root;
    }
    /**
     * 判断一颗二叉树是否是相等的
     * /

    /**判断一颗二叉树是否是镜像对称*/
    /**给定的一棵树是否是平衡二叉树*/
    /**判断一颗树上根到叶子节点能否构成指定的值*/
    public boolean hasPathSum(TreeNode root,int sum){
        if (root==null){
            return false;
        }
        if (root.left==null&&root.right==null){
            return root.val==sum;
        }
        if (hasPathSum(root.left,sum-root.val)){
            return true;
        }
        if (hasPathSum(root.right,sum-root.val)){
            return true;
        }
        return false;
    }
    /**求所有的左叶子的和*/
    /**给定一颗二叉树，返回所有表示从根节点到叶子节点路径的字符串*/
    public List<String> binaryTreePaths(TreeNode root){
        List<String> result=new ArrayList<>();
        if (root==null){//边界条件
            return result;
        }
        if ((root.left==null)&&(root.right==null)){//终止条件
            result.add(root.val+"");
            return result;
        }
        List<String> left=binaryTreePaths(root.left);
        for (int i=0;i<left.size();i++){
            result.add(root.val+"->"+left.get(i));
        }
        List<String> right=binaryTreePaths(root.right);
        for(int i=0;i<right.size();i++){
            result.add(root.val+"->"+right.get(i));
        }
        return result;//最终的结果

    }
    /**给定二叉树的所有几点和*/
    public List<String> sumNumbersf(TreeNode root) {
        ArrayList<String> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        if((root.left==null)&&(root.right==null)){
            result.add(root.val+"");
            return result;
        }
        List<String> left=sumNumbersf(root.left);
        for (int i=0;i<left.size();i++){
            result.add(root.val+""+left.get(i));
        }
        List<String> right=sumNumbersf(root.right);
        for(int i=0;i<right.size();i++){
            result.add(root.val+""+right.get(i));
        }
        return result;//最终的结果

    }
    public int sumNumbers(TreeNode root) {

        List<String> result=sumNumbersf(root);
        int sum=0;
        for (int i=0;i<result.size();i++){
            sum+=Integer.valueOf(result.get(i));
        }
        return sum;
    }

    /**给出一颗二叉树以及数字sum，判断在这颗二叉树上存在多少条路径，其路径的上的所有的节点和为SUM*/
    public int pathSum(TreeNode root,int sum){
        if (root==null){
            return 0;
        }
        int res=findPath(root,sum);//包括当前节点的路径
        //不包括当前节点的路径
        res+=pathSum(root.left,sum);//重新寻找
        res+=pathSum(root.right,sum);//重新寻找
        return res;

    }
    public int findPath(TreeNode node,int num){
        if (node==null){
            return 0;
        }
        int res=0;
        if (node.val==num){//如果当前的数字就是num
            res+=1;
        }
        res+=findPath(node.left,num-node.val);
        res+=findPath(node.right,num-node.val);
        return res;
    }
    /**判断二分搜索树的公共节点*/
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if (root==null){
            return null;
        }
        if ((p.val<root.val)&&(q.val<root.val)){
            return lowestCommonAncestor(root.left,p,q);
        }
        if ((p.val>root.val)&&(p.val>root.val)){
            return lowestCommonAncestor(root.right,p,q);
        }
        return  root;//分布在左右子树，那么公共节点必定为root
    }
    /**给定一个整形数组，其中每一个元素各不相同，返回这些元素所有排列的可能*/
    /*public List<List<Integer>> permute(List<Integer> nums){

    }*/
}
