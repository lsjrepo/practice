package leetCode;

import java.util.Scanner;

/**
 * Created by lsj on 17-9-18.
 */
public class Main7 {
    public static boolean detectCapitalUse(String word) {
        if (word.charAt(0)>'A'&&word.charAt(0)<'Z'){
            int count=0;
            for (int i=1;i<word.length();i++){
                if (word.charAt(i)>='a'&&word.charAt(i)<='z'){
                    count++;
                }
            }
            if (count==word.length()-1||count==0){
                return true;
            }
            else return false;
        }
        else{
            int count=0;
            for (int i=1;i<word.length();i++){
                if (word.charAt(i)>='a'&&word.charAt(i)<='z'){
                    count++;
                }
            }
            if (count==word.length()-1){
                return true;
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        String s=sin.next();
        System.out.println(detectCapitalUse(s));
    }
}
