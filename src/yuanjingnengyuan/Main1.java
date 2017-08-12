package yuanjingnengyuan;

import java.util.*;

/**
 * Created by lsj on 17-8-12.
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.next();

        Set<Character> hashSet=new HashSet<>();
        char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            hashSet.add(c[i]);

        }
        System.out.println(hashSet.size());
    }

}
