package xlei;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-19.
 */
public class Main02 {
    public static void main(String[] args) {
        {
            Scanner sin=new Scanner(System.in);
            int n1=sin.nextInt();
            StringBuilder s=new StringBuilder();
            if (n1>0){
                s.append(n1);
                System.out.println(s.reverse().toString().replaceAll("0",""));
            }
            else if (n1<0){
                n1=-(n1);
                s.append(n1);
                System.out.println("-"+s.reverse().toString().replaceAll("0",""));
            }
            else{
                System.out.println("");
            }
        }
    }
}
