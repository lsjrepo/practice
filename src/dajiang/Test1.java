package dajiang;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-8.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int H=sin.nextInt();
        int x=sin.nextInt();
        int y=sin.nextInt();
        int h=sin.nextInt();
        int s=sin.nextInt();
        System.out.println(getHeight(H,x,y,h,s));
    }

    public  static int getHeight(int H, int x, int y, int h, int s) {

        if (s>0&&s<=(h/x)){
            return s*x;
        }
         else if(s>(h/x)){
            float t=0;

            t=(float)h/(float)x;

           return (int) Math.round(s*x-(s-(t))*y);

        }
        else{
             return 0;
        }
    }
}
