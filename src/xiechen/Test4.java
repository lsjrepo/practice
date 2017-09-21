package xiechen;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lsj on 17-9-21.
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        String s=sin.nextLine();
        StringBuilder sb=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();
        char[] c=s.toCharArray();
        for (int i=0;i<c.length;i++){
            set.add(c[i]);
        }
        for (Character c1:set){
            sb.append(c1);
        }
        System.out.println(sb.toString());
    }
}
