package fivex;

import java.util.*;

/**
 * Created by lsj on 17-9-18.
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        String s1=sin.nextLine();
        String s2=sin.nextLine();
        String[] s3=s1.split(" ");
        String[] s4=s2.split(" ");
        int[] c=new int[s3.length];
        int[] c1=new int[s4.length];
        for (int i=0;i<s3.length;i++){
            c[i]=Integer.valueOf(s3[i]);
        }
        for (int j=0;j<s4.length;j++){
            c1[j]=Integer.valueOf(s4[j]);
        }

        System.out.println(getP(c,c1));
    }

    private static int getP(int[] c, int[] c1) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int result=0;
        for (int i=1;i<c.length;i++){
            if (hashMap.containsKey(c[i])){

                hashMap.put(c[i],hashMap.get(c[i])+c1[i]);
            }
            else  hashMap.put(c[i],c1[i]);
        }
        Iterator<Map.Entry<Integer, Integer>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            result=result>entry.getValue()?result:entry.getValue();

        }


    }
}
