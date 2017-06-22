package dynamicP;

/**
 * Created by Ji on 2017/5/2.
 * 全排列问题
 * 1.对ABC进行全排列有以下的几种情况:
 * ABC ACB BAC BCA CBA CAB
 * n个去重数列的全排列的步骤:
 * 1)固定第一个数
 * 2)对n-1数进行全排列
 * 3)把第一步时数组的顺序换过来(不然无法固定第一个数）
 */
public class QuanPaiLie {

    public static void permutation(char[] c,int start,int end){

        if(end<=1){
            return;
        }

        if(end==start){
            System.out.println(c);
        }

        for(int i=start;i<=end;i++){

            swap(c,i,start);//固定第一个数,第一个数的取值分别为数组中的每一个数

            permutation(c,start+1,end);//对后n-1个数进行全排列

            swap(c,start,i);//把顺序换回来
        }

    }

    public static void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
    public static void main(String[] args) {
        String s="abc";

        permutation(s.toCharArray(),0,s.toCharArray().length-1);
    }



}
