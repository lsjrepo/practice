package wangyi;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-9.
 */
public class Test07 {
    public static void main(String[] args) {

        Scanner sin=new Scanner(System.in);
        int len=sin.nextInt();
        int[] a=new int[len];
        for (int i=0;i< a.length;i++){
            a[i]=sin.nextInt();
        }

        int min=minDifference(a);
        System.out.println(min);
    }
    public static int minDifference(int[] data){
        if(data==null||data.length==0){
            return Integer.MIN_VALUE;
        }
        sort(data,0,data.length-1);
        int len=data.length;
        int[] diff=new int[len-1];
        for(int i=0;i<len-1;i++){
            diff[i]=data[i+1]-data[i];
        }

        return min(diff);
    }
    public static int min(int[] diff){
if(diff==null||diff.length==0){
return Integer.MIN_VALUE;
}
int min=diff[0];
for(int i=0,len=diff.length;i<len;i++){
if(min>diff[i]){
min=diff[i];
}
}
return min;
}public static void sort(int[] x,int s,int e){
if(s>=e){
return;
}
int i=s;
int j=e;
boolean flag=false;
while(i!=j){
if(x[i]>x[j]){
swap(x,i,j);
flag=!flag;
}
if(flag){
i++;
}else{
j--;
}
}
sort(x,s,i-1);
sort(x,j+1,e);
}
public static void  swap(int[] x,int i,int j){
int tmp=x[i];
x[i]=x[j];
x[j]=tmp;
}
}

