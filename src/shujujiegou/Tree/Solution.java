package shujujiegou.Tree;



import java.util.ArrayList;

/**
 * Created by lsj on 17-4-12.
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class Solution {

    ArrayList<Integer> result=new ArrayList<>();
    ArrayList<ArrayList<Integer>>  results=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {


        if(root==null){
            return results;
        }
        result.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            results.add(new ArrayList<Integer>(result));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        result.remove(result.size()-1);//回到上一级,继续递归
        return results;
    }

}