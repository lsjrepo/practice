package jianzhioffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 */

/**
 * 二叉树的层序遍历*/
class Test{
    public void levelTravel(TreeNode root){
        if (root==null){
            return ;
        }
        LinkedList<TreeNode> list=new LinkedList<>();
        list.offer(root);
        while(!list.isEmpty()){
            TreeNode node=list.poll();
            System.out.println(node.val);
            if (node.left!=null){
                list.offer(node.left);
            }
            if (node.right!=null){
                list.offer(node.right);
            }

        }
    }
}
public class Solution54 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if (pRoot==null){
            return result;
        }
        int depth=0;
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()){
            depth++;
            ArrayList<Integer> layerList=new ArrayList<>();
            int cur=0,size=queue.size();
            if ((depth&1)==0){
                Iterator<TreeNode> it=queue.descendingIterator();
                while(it.hasNext()){
                    layerList.add(it.next().val);
                }
            }
            else{
                Iterator<TreeNode> iterator=queue.iterator();
                while(iterator.hasNext()){
                    layerList.add(iterator.next().val);
                }
            }
            while(cur<size){//添加下一行的元素，size是当前那层节点的数目
                TreeNode node=queue.poll();
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
                cur++;
            }
            result.add(layerList);
        }
        return result;

    }
}
