package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by lsj on 17-7-23.
 */
public class Solution55 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        LinkedList<TreeNode> list=new LinkedList<>();
        list.offer(pRoot);
        while(!list.isEmpty()){
            TreeNode temp=list.poll();
            ArrayList<Integer> arrayList=new ArrayList<>();
            arrayList.add(temp.val);
            if (temp.left!=null){
                list.offer(temp.left);
            }
            if (temp.right!=null){
                list.offer(temp.right);
            }
            result.add(arrayList);
            arrayList.clear();

        }
        return result;
    }
}
