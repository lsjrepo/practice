package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class Solution55 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        if (pRoot==null){
            return result;
        }
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.offer(pRoot);
        int start=0,end=1;
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            arrayList.add(temp.val);
            end--;
            if (temp.left!=null){
                queue.offer(temp.left);
                start++;
            }
            if (temp.right!=null){
                queue.offer(temp.right);
                start++;
            }
            if (end==0){//表示当前的层已经结束
                result.add(new ArrayList<>(arrayList));
                arrayList.clear();
                end=start;
                start=0;
            }
        }
        return result;
    }
}
