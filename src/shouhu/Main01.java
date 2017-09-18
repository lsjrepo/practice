package shouhu;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-17.
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sin.nextInt();
        }
        int y=sin.nextInt();
        int maxd=sin.nextInt();
        int k=(y+1)*maxd;
        if (k>a.length){
            System.out.println("超出分页范围");
        }
        else{
            for (int i=0;i<maxd;i++){
                System.out.println(a[y*maxd+i]);
            }
        }
    }
}
