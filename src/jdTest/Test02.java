package jdTest;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-8.
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        String s=new String();
        s=sin.nextLine();
        System.out.println(findWay(s));
    }

    public  static int findWay(String s) {
        int temp=0;
        int count=1;
        if (s.length()==0){
            return 0;
        }
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('){
                temp++;
            }
            else{
                count*=temp;
                temp--;
            }
        }
       return count;
    }
}
