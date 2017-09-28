package classic;

/**
 * Created by lsj on 17-9-28.
 * 0-1背包问题
 */
public class Bag01 {
    public static int bag01(int[] value,int[] weight,int c){
        if(weight.length==0){return 0;}
        int[][] memo=new int[weight.length][c+1];
        for (int j=0;j<=c;j++){
            memo[0][j]=(j>=weight[0]?value[0]:0);
        }
        for (int i=1;i<weight.length;i++){
            for (int j=0;j<=c;j++){
                memo[i][j]=memo[i-1][j];
                if(j>=weight[i]){
                    memo[i][j]=Math.max(memo[i][j],value[i]+memo[i-1][j-weight[i]]);
                }
            }
        }
        return memo[weight.length-1][c];
    }

    public static void main(String[] args) {
        int[] value={6,10,12};
        int[] weight={1,2,3};
        System.out.println(bag01(value,weight,5));
    }
}
