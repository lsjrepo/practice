package shujujiegou;

/**
 * Created by lsj on 17-4-8.
 * 创建高度最小的二叉搜索树
 *
public class MinimalBST {
    public static TreeNode buildMinimalBST(int[] vals){
        if(vals==null||vals.length==0){
            return null;
        }
        int start=0;
        int end=vals.length-1;
        TreeNode bstTree=dobuild(vals,start,end);
        return bstTree;
    }
    public static TreeNode dobuild(int[] vals,int start,int end){
        if(end<start){
            return null;
        }
        int mid=(start+end)>>1;
        TreeNode node=new TreeNode(vals[mid]);
        node.left=dobuild(vals,start,mid-1);
        node.right=dobuild(vals,mid+1,end);
        return node;
    }
    public static void printTree(TreeNode node){//前序遍历
        System.out.println(node.val);
        if (node.left!=null){
            printTree(node.left);
        }
        if(node.right!=null){
            printTree(node.right);
        }
    }
    public static void main(String args[]){
        int[] a={1,2,3,4,5};
        TreeNode tree=buildMinimalBST(a);
        printTree(tree);
    }
}
 */



/**求最小二叉搜索树的高度*/
public class MinimalBST {
    public static int buildMinimalBST(int[] vals) {
        // write code here
        if (vals==null||vals.length<1){
            return 0;
        }
        return dobuild(vals,0,vals.length-1);
    }
    public  static int dobuild(int[] a,int start,int end){
            if(end<=start){
                return 1;
            }
            int mid=(end+start)>>1;
            int lefth=1+dobuild(a,start,mid-1);
            int righth=1+dobuild(a,mid+1,end);
            return Math.max(lefth,righth);

    }
    public static void main(String args[]){
        int[] a={1,2,3,4,5};
        int height=buildMinimalBST(a);
        System.out.println(height);
    }
}