package jianzhioffer;

;import java.io.Serializable;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class Solution56 {
    public int index=-1;
    String Serialize(TreeNode root) {

       StringBuilder sb=new StringBuilder();
       if (root==null){
           sb.append("#,");
           return sb.toString();
       }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();

    }
    TreeNode Deserialize(String str) {
        index++;
        if (index>=str.length()){
            return null;
        }
        String[] strr=str.split(",");
        TreeNode root=null;
        if (!strr[index].equals("#")){
            root=new TreeNode(Integer.valueOf(strr[index]));
            root.left=Deserialize(str);
            root.right=Deserialize(str);
        }
        return root;
    }
}
