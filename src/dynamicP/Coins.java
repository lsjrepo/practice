package dynamicP;

/**
 * Created by lsj on 17-5-14.
 *
 有数量不限的硬币，币值为25分、10分、5分和1分，
 请编写代码计算n分有几种表示法。
 给定一个int n，请返回n分有几种表示法。
 保证n小于等于100000，为了防止溢出，请将答案Mod 1000000007。
 测试样例：
 6
 返回：2
 思路:dp[j]表示组成j元一共的组合种类个数
 现在来考虑凑j元一共可能的情况？
 1.最后一枚硬币如果不使用新的币值,那么还是原来的dp[i]种
 2.如果最后一枚硬币使用了新的币值coin[i],因为最后的那个位置已近被占掉了,
 那么组成前面j-coin[i]的可能情况为dp[j-coin[i]]种,也即,最后位置上最后一枚硬币使用了新的币值的情况
 所以dp[j]=(dp[j]+dp[j-coin[i]])
 */
public class Coins {
    public int countWays(int n) {
        // write code here
        int[] coin={1,5,10,25};
        int[] dp=new int[100001];
        dp[0]=1;
        for(int i=0;i<coin.length;i++){
            for(int j=coin[i];j<=n;j++){
                dp[j]=(dp[j]+dp[j-coin[i]])%1000000007;
            }
        }
        return dp[n];
    }
}
