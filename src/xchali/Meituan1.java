package xchali;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xch on 2017/8/31.
 */
public class Meituan1 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] s=new int[n];
        for (int i = 0; i <n ; i++) {
            s[i]=scanner.nextInt();
        }
        Arrays.sort(s);
        int sum=0;
        for (int i = 0; i <n-1 ; i++) {
            sum+=s[i];
        }
        if(sum>=s[n-1]) System.out.println("Yes");
        else System.out.println("No");
        }

}
