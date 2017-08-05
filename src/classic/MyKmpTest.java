package classic;

/**
 * Created by lsj on 17-8-3.
 */
public class MyKmpTest {
    public static void main(String[] args) {
        String sub="aabcc";
        String basic="aaasdsdaaaaaaasadaabcc";
        System.out.println(simpleSearch(basic,sub));
        int[] a=getNext(sub);//获得next数组,next数组表示最长的前后缀公共部分
        System.out.println(kmpSearch(basic,sub,a));
    }
    public static int kmpSearch(String basic,String sub,int[] next){
        int i=0,j=0;
            while(i<basic.length()&&j<sub.length()){
            if (j == -1||basic.charAt(i)==sub.charAt(j)){
                i++;
                j++;
            }
            else{
               j=next[j];
            }
        }
        if (j==sub.length()){
            return (i-j);
        }
        else{
            return -1;
        }
    }
    public static int[] getNext(String sub) {
        int sub_len=sub.length();
        int[] next=new int[sub_len];
        next[0]=-1;
        int i=0;//sub串的下标
        int j=-1;
        while(i<(sub_len-1)){
            if (j==-1||sub.charAt(i)==sub.charAt(j)){
                i++;
                j++;
                next[i]=j;
            }
           else{
                j=next[j];
            }

        }
        return next;
    }

    public static int simpleSearch(String s, String sub) {
        int s_len=s.length();
        int sub_len=sub.length();
        int i=0,j=0;
        while(i<s_len&&j<sub_len){
            if (s.charAt(i)==sub.charAt(j)){
                i++;
                j++;
            }
            else{
                i=i-j+1;
                j=0;
            }
        }
        if (j==sub.length()){
            return i-j;
        }
        return -1;
    }


}
