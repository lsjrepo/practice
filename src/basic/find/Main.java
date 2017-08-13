package basic.find;

import java.util.Scanner;

/**
 * Created by lsj on 17-8-13.
 */
public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        System.out.println(find(a,0,a.length-1,10));
    }
    public static  int find(int[] a,int start,int end,int target){
        if (start>end){
            return -1;
        }
        else{
            int mid=(start+end)>>1;
            if (a[mid]==target){
                return mid;
            }
            else if (a[mid]<target){

                return find(a,mid+1,end,target);
            }
            else{
                return find(a,start,mid-1,target);
            }
        }

    }
}
