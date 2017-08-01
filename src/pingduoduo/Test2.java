package pingduoduo;

import java.util.Scanner;

/**
 * Created by lsj on 17-8-1.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        String s1=sin.next();
        String s2=sin.next();
        int N=Math.max(s1.length(),s2.length());
        int[] a1=new int[N];
        int[] a2=new int[N];
        int[] c=new int[2*N];
        for(int i=0;i<s1.length();i++){
            a1[s1.length()-1-i]= s1.charAt(i)-'0';
        }
        for(int j=0;j<s2.length();j++){
            a2[s2.length()-1-j]= s2.charAt(j)-'0';
        }
        multiply(a1,a2,c,N);
        int l=2*N-1;
        while(c[l]==0){
            l--;
        }
        for (int i=l;i>=0;i--){
            sb.append(c[i]);
        }
        System.out.println(sb.toString());
    }

    private static void multiply(int[] a1, int[] a2, int[] c,int N) {
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                c[i+j]+=a1[i]*a2[j];

            }

        }
        for(int i=0;i<2*N-1;i++){
            c[i+1]+=c[i]/10;
            c[i]=c[i]%10;
        }
    }
}
