package didi;

import java.util.*;

/**
 * Created by lsj on 17-9-10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        long n=sin.nextLong();
        ArrayList<Long> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add((long) sin.nextInt());
        }
        System.out.println(get(a));
    }
    public static long get(ArrayList<Long> a){
        long countz=0;
        Map<Long,Long> hashMap=new HashMap<>();
        if (a.size()==0){
           return 0;
        }
        for (int i=0;i<a.size();i++){
            if (hashMap.containsKey(a.get(i))){
                hashMap.put(a.get(i),hashMap.get(a.get(i))+1);
            }
            else  hashMap.put(a.get(i), (long) 1);
        }
        Iterator<Map.Entry<Long, Long>> it = hashMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Long, Long> entry = it.next();
            long value=entry.getValue();
            long key=entry.getKey();
            if ((key!=0)&&(value>=2)&&(value%2==0)){
                countz+=(value-1);
            }
            else if (key==0){
                countz+=value;
            }
        }
       return countz;
    }
}
