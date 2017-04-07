package jdTest;

import java.util.Scanner;

/**
 * Created by lsj on 17-4-7.
 *
 * 找到所有的小偷数,
 * 输入有2行,第一行是总人数,
 * 第2行是一个字符串,字符串中数字1-9表示警察,数字的大小表示警察可以
 * 够到的范围,X表示小偷,#表示普通人
 * eg:
 * X1X#2X#XX
 * 输出为3,
 * 0,2,5位置上的小偷可以抓到
 * 思路:
 * 遍历字符数组,找到所有警察的位置,并且把他能够够到的范围通过另外一个boolean型的数组标记出来
 * 然后再一次遍历找到所有标记为true的小偷
 *
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        char[] c=new char[n];
        c=s.toCharArray();
        int num=0;
        boolean reachable[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(c[i]=='X'||c[i]=='#'){
                continue;
            }
            int x=c[i]-'0';
            for(int j=0;j<=x;j++){
                if((i-j)>=0){
                    reachable[i-j]=true;
                }
                if((i+j)<n){
                    reachable[i+j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(c[i]=='X'&&reachable[i]){
                num++;
            }
        }

        System.out.println(num);


    }

}
