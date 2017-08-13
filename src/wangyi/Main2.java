package wangyi;

import java.util.Scanner;

/**
 *
 */
public class Main2 {
    public static void main(String[] args) {
        int count=0;
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();//数组元素
        int k=sin.nextInt();//数组元素范围
        int[] index=new int[n];

    }
    public boolean testify(int[] index,int n,int k){
        boolean flag=false;
        if (index.length==n){
            for(int i=0;i<n-1;i++){
                if (index[i]>=1&&index[i]<=k){
                    if ((index[i]<=index[i+1])||(index[i]%index[i+1]!=0)){
                            flag=true;
                    }
                }
            }
        }
        return flag;
    }
}
