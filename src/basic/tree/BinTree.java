package basic.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 遍历二叉树的非递归实现
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class BinTree {
    /**非递归前序遍历*/
    public static void preOrder(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        while(root!=null||!stack.isEmpty()){
           while(root!=null){
               System.out.println(root.val);
               stack.push(root);
               root=root.left;
           }
           if (!stack.isEmpty()){
               root= stack.pop();
               root=root.right;
           }
        }
    }
    /**中序遍历二叉树*/
    public static void inOrder(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            if (!stack.isEmpty()){
                root=stack.pop();
                System.out.println(root.val);
                root=root.right;
            }
        }
    }
    /**后序遍历二叉树*/
    public static void postOrder(TreeNode root){
        Stack<TreeNode> stack1=new Stack<>();
        Stack<Integer>  stack2=new Stack<>();
        Integer i=new Integer(1);
        while(root!=null||!stack1.isEmpty()){
            while(root!=null){
                stack1.push(root);
                stack2.push(new Integer(0));
                root=root.left;
            }
            while(!stack1.isEmpty()){
                stack2.pop();
                System.out.println(stack1.pop().val);
            }
            if (!stack1.isEmpty()){
                stack2.pop();
                stack2.push(new Integer(1));
                root=stack1.peek();
                root=root.right;
            }
        }
    }
    /**层序遍历二叉树*/
    private void levelTraverse(TreeNode root){
        if(root == null)
            return;
        Queue<TreeNode> queue = new LinkedList();//层序遍历时保存结点的队列9
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.val);//访问节点
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
        }
    }

}
