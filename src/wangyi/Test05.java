package wangyi;
import java.util.Scanner;
/**
 * 两次输入
 * 题目要求:
 * 连续输入一个数组,从下标1开始，将数组中的所有元素交换排列
 * 如果所有 的元素满足:
 * A[i]*[i+1]%4==0，那么输出true,反之输出No
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        String res="";
        int t=sin.nextInt();
        for(int j=0;j<t;j++){
            int len=sin.nextInt();
            int[] a=new int[len];
            for (int i=0;i<len;i++){
                a[i]=sin.nextInt();
            }
            res+=judge(a)+"@";
        }
        String result=res.substring(0,res.length()-1);//去掉最后一个@
        System.out.println(result.replaceAll("@","\n"));
    }
    public static String judge(int[] a){
        int count2=0;
        int count4=0;
        int countodd=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%2!=0){
                countodd++;
            }
            if (a[i]%4==0){
                count4++;
            }

        }
        count2=a.length-countodd-count4;

        if (count2==0){
            if (count4>=count2-1){
                return "Yes";
            }
            else{
                return "No";
            }
        }
        else{
            if (count4>=countodd){
                return "Yes";
            }
            else{
                return "No";
            }
        }
    }
}
