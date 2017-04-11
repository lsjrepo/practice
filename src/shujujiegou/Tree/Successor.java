package shujujiegou.Tree;

import java.util.Stack;

/**
 * Created by lsj on 17-4-10.
 *
 请设计一个算法，寻找二叉树中指定结点的下一个结点（即中序遍历的后继）。
 给定树的根结点指针TreeNode* root和结点的值int p，请返回值为p的结点的后继结点的值。
 保证结点的值大于等于零小于等于100000且没有重复值，若不存在后继返回-1。
 *
 */
public class Successor {
    public int findSucc(TreeNode root, int p) {
        // write code here
        Stack<TreeNode> ss=new Stack<TreeNode>();
        boolean isfind=false;
        TreeNode currentNode=root;
        while(currentNode!=null||!ss.isEmpty()){//如果不是空树
            while(currentNode!=null){
                ss.add(currentNode);
                currentNode=currentNode.left;

            }
            if(!ss.isEmpty()){
                TreeNode tmp=ss.pop();

                if(isfind){
                    return tmp.val;
                }
                if(tmp.val==p){
                    isfind=true;
                }
                currentNode=tmp.right;
            }
        }
        return -1;
    }
}
