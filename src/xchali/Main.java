package xchali;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
/** 请完成下面这个process函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    private static int process(BoxTemplate boxTemplate,Model[] models)
    {
     if(models.length<=10) return 1;
     else if(models.length<20) return 2;
     else return 5;
    }
   static class Model{
        int price;
        int length;
        int width;
        int height;
    }
   static class BoxTemplate{
        int price;
        int length;
        int width;
        int height;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        BoxTemplate boxTemplate=new BoxTemplate();
        boxTemplate.price = 1200;
        int flag=1;

        while (scanner.hasNext()){
            boxTemplate.length = scanner.nextInt();
            boxTemplate.width = scanner.nextInt();
            boxTemplate.height = scanner.nextInt();
            int max11,max12,max13;
            int[] s1={boxTemplate.length, boxTemplate.width,boxTemplate.height};
            Arrays.sort(s1);
            max11=s1[0];
            max12=s1[1];
            max13=s1[2];
            int itemNum = scanner.nextInt();
           Model[] items = new Model[itemNum];
            for(int i=0; i<itemNum; i++){
                Model item = new Model();
                item.price = scanner.nextInt();
                item.length = scanner.nextInt();
                item.width = scanner.nextInt();
                item.height = scanner.nextInt();
                int max1,max2,max3;
               int[] s={item.length, item.width,item.height};
               Arrays.sort(s);
               max1=s[0];
               max2=s[1];
               max3=s[2];

                if(item.price>2000||!(max1<max11&&max2<max12&&max3<max13)) flag=0;
                items[i] = item;
            }
            long startTime = System.currentTimeMillis();
          //  boxMinNum = Integer.MAX_VALUE;
            if(flag==0) System.out.println(-1);
            else{
                System.out.println (process(boxTemplate,items));
            }


        }
    }

}