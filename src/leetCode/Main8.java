package leetCode;



/**
 * Created by lsj on 17-9-20.
 */
class TreeNode1 {
     int val;
     TreeNode1 left;
     TreeNode1 right;
     TreeNode1(int x)
     { val = x; }
 }
public class Main8 {
    public boolean isSameTree(TreeNode1 p, TreeNode1 q) {
        if (p==null&&q==null) return true;
        if (p==null||q==null) return false;
        if (p.val==q.val)
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        return false;

    }
}
