package classic;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/24.
 * 约塞夫问题2
 * 思路:
 * 1.构造双向循环链表
 * 2.
 */
public class Joseph2 {
    public static int getResult(int n){
        LinkedList<Integer> list=new LinkedList<>();
        int roundMax=2,cut=0;//roundMax表示
        for (int i=1;i<=n;i++){
            list.add(i);
        }//构造双向循环链表
        while(list.size()>1){
            int k=0;
            while(list.size()>1&&k<list.size()){//一轮
               /* roundMax%=roundMax;*/
               cut=(cut+1)%roundMax;
                if(cut!=1){
                    list.remove(k);
                }
                else{
                    k++;
                }
            }
            roundMax++;//下一轮增加
            cut=0;
            if (list.size()>1){//下一次将上次链表最后的那个数移动到链表的最前面
                int temp=list.removeLast();
                list.addFirst(temp);
            }
        }
        return list.pop();//输出最后一个元素
    }

    public static void main(String[] args) {
        System.out.println(getResult(5));
    }
}
