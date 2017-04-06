package shujujiegou;

/**
 * 有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，
 * 也就是个位排在链表的首部。编写函数对这两个整数求和，并用链表形式返回结果。
 给定两个链表ListNode* A，ListNode* B，请返回A+B的结果(ListNode*)。
 测试样例：

 {1,2,3},{3,2,1}

 返回：{4,4,4}
 *
 * */
class ListNode {
   int val;
   ListNode next = null;

   ListNode(int val) {
       this.val = val;
   }
}

class Plus {
   public ListNode plusAB(ListNode a, ListNode b) {
       // write code here
       ListNode aTemp=a;
       ListNode bTemp=b;
       ListNode result=new ListNode(-1);
       ListNode p=result;
       int jingwei=0;
       while(aTemp!=null||bTemp!=null){
           if(aTemp!=null&&bTemp    !=null){
               p.next=new ListNode((aTemp.val+bTemp.val+jingwei)%10);
               p=p.next;
               jingwei=(aTemp.val+bTemp.val+jingwei)/10;
               aTemp=aTemp.next;
               bTemp=bTemp.next;

           }
           else if(aTemp!=null){
               p.next=new ListNode((jingwei+aTemp.val)%10);
               p=p.next;
               jingwei=(aTemp.val+jingwei)/10;
               aTemp=aTemp.next;

           }
           else if (bTemp!=null){
               p.next=new ListNode((jingwei+bTemp.val)%10);
               p=p.next;
               jingwei=(bTemp.val+jingwei)/10;

               bTemp=bTemp.next;
           }


       }
       if (jingwei!=0){
           p.next=new ListNode(jingwei);
           p=p.next;

       }
       return result.next;
   }
}