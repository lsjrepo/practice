package test;

/**
 * Created by lsj on 17-8-1.
 */
public class KmpTest {
    public static void main(String[] args) {
        String sub="abc";
        String s="fcioabclksahfdlpkas";
        int[] a=Get_next(sub);
        System.out.println(KMPIndex(s,sub,a));
    }

    public static int[] Get_next(String t)
    {
        int[] next;
        int i=1,j=0;
        next=new int[t.length()];
        next[0]=0;
        while(i<t.length())
        {
            if(j==0||t.charAt(i-1)==t.charAt(j-1))
            {
                if(t.charAt(i)!=t.charAt(j))
                {

                    next[i++]=++j;
                }else
                {

                    next[i++]=next[j++];
                }

            }
            else
            {
                j=next[j-1];
            }
        }

        return next;
    }
    private static int KMPIndex(String s, String t, int[] next) {
        int i=0,j=0;
        while(i<s.length()&&j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;j++;
            }else
            {
                j=next[j];
                if(j==0)
                {
                    i++;
                }
            }
        }
        if(j<=t.length())
        {
            return i-j;
        }
        return -1;
    }
}
