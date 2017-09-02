package xchali;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 字符串的组合问题
 */
public class Meituan2 {
    private static int Maxsize;
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int maxLength=0;
        int N=sin.nextInt();
        int[] input=new int[N];
        for (int i=0;i<N;i++){
            input[i]=sin.nextInt();
        }
        int K=sin.nextInt();

        combine(input,K);
       /* for(List l:result){
            if (l.size()>maxLength){
                maxLength=l.size();
            }
        }*/
        System.out.println(Maxsize);
    }
    private static void combine(int[] input,int k) {
        if (input.length==0){
            return ;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<input.length;i++){
            getSubString(input,0,i,k,list);
        }

    }
    public static void getSubString(int[] input,int start,int end,int k,List<Integer> list){
        if (end==-1){
            int sum=0;
            for (Integer t:list){
                sum+=t;
            }
            if ((sum%k)==0){
                if(list.size()>Maxsize) Maxsize=list.size();
            }
            return;
        }
        if(start==input.length){
            return;
        }
        list.add(input[start]);
        getSubString(input,start+1,end-1,k,list);
        list.remove(list.size()-1);
        getSubString(input,start+1,end,k,list);
    }
}
