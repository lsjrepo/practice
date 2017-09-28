    package qunaer;

    import java.util.Scanner;

    /**
     * Created by lsj on 17-9-26.
     */
    public class Main04 {
        public static void main(String[] args) {
            Scanner sin=new Scanner(System.in);
            int m=sin.nextInt();
            int[] grade=new int[m];
            int[] time=new int[m];
            for (int i=0;i<m;i++){
                grade[i]=sin.nextInt();
            }
            for (int j=0;j<m;j++){
                time[j]=sin.nextInt();
            }
            int totalTime=sin.nextInt();
            int[] f = new int[totalTime+1];
            for(int i=0;i<f.length;i++){
                f[i] = 0;
            }
            for(int i=0;i<m;i++){
                for(int j=f.length-1;j>=time[i];j--){
                    f[j] = Math.max(f[j], f[j-time[i]]+grade[i]);
                }
            }
            System.out.println(f[f.length-1]);
        }
    }
