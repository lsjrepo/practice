package shouhu;

import java.util.*;

/**
 * Created by lsj on 17-9-17.
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n;i++){
            a[i]=sin.nextInt();
        }
        System.out.println(getmin(a));
    }

    public static long getmin(int[] a) {
        if (a.length==0){
            return 0;
        }
        long result=0;
        ArrayList<Integer> list=new ArrayList<>();
        Map<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<a.length;i++){
            if (hashMap.containsKey(a[i])){
                hashMap.put(a[i],hashMap.get(a[i])+1);
            }
            else  hashMap.put(a[i],1);
        }
        Iterator<Map.Entry<Integer, Integer>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            if (entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        for (int i=0;i<a.length;i++){
            result+=a[i];
        }
        for (int i=0;i<list.size();i++){
            result+=list.get(i);
        }
        if (a.length%2!=0){
            result=result-a[a.length/2];
        }
        return result;
    }


}
