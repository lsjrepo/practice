package shujujiegou;

import java.util.*;

/**
 * Created by lsj on 17-4-7.
 *
 对于一个有向图，请实现一个算法，找出两点之间是否存在一条路径。
 给定图中的两个结点的指针UndirectedGraphNode* a,UndirectedGraphNode* b(请不要在意数据类型，图是有向图),请返回一个bool，
 代表两点之间是否存在一条路径(a到b或b到a)。
思路:路径并不一定是点对点的,经过多个节点到达目标节点也是可以的
 这里采用广度优先遍历来遍历图,
 1.判断a节点的邻居节点中是否有b节点,如果有返回true,如果没有将所有的邻居节点
 存入队列中
 2.依次查找每一个邻居节点的邻居节点是否存在b节点,继续按照上边的步骤执行
 */
class UndirectedGraphNode {
    int label = 0;
    UndirectedGraphNode left = null;
    UndirectedGraphNode right = null;
    ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

    public UndirectedGraphNode(int label) {
        this.label = label;
    }
}
public class Path {
    public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
        // write code here

        return check(a,b)||check(b,a);
    }
    public boolean check(UndirectedGraphNode a,UndirectedGraphNode b){
        if (a==null||b==null){
            return false;
        }
        if (a==b){
            return true;
        }
        Map<UndirectedGraphNode,Boolean> visited=new HashMap<>();//标记这个节点已经被访问过,如果是带环图,如果不标记,会进入死循环
        LinkedList<UndirectedGraphNode> tmp=new LinkedList<>();
        UndirectedGraphNode currentNode;
        tmp.push(a);
        visited.put(a,true);
        while(tmp.size()>0){
            currentNode=tmp.pop();
            ArrayList<UndirectedGraphNode> neighbors=currentNode.neighbors;
            if (neighbors!=null){
                for(int i=0;i<neighbors.size();i++){
                    if(neighbors.get(i)==b){
                        return true;
                    }
                    if(visited.get(neighbors.get(i))==null||!visited.get(neighbors.get(i))){//如果该节点没有被访问过
                        tmp.push(neighbors.get(i));
                        visited.put(neighbors.get(i),true);
                    }
                }
            }


        }
        return false;
    }
}
