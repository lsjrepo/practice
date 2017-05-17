package classic;

/**
 * Created by lsj on 17-5-17.
 *
 约瑟夫问题是一个非常著名的趣题，即由n个人坐成一圈，按顺时针由1开始给他们编号。
 然后由第一个人开始报数，数到m的人出局。现在需要求的是最后一个出局的人的编号。
 给定两个int n和m，代表游戏的人数。请返回最后一个出局的人的编号。保证n和m小于等于1000。
 测试样例：
 5 3
 返回：4
 */
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class Joseph {
    public static int getResult(int n, int m) {
        // write code here
        ListNode p=new ListNode(0);
        ListNode head=p;
        for(int i=1;i<=n;i++){
            p.next=new ListNode(i);
            p=p.next;
        }
        p.next=head.next;//从1开始的单项循环链表
        /*System.out.println(p.val);*/
        while(--n>0){
            int i=m;
            while(--i>0){
                p=p.next;
            }
            p.next= p.next.next;
        }
        return p.val;

    }

    public static void main(String[] args) {
        System.out.println(getResult(5,3));
    }
}