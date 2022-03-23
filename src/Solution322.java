public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        if (amount==0){
            return 0;
        }
        for (int i = 0; i <= amount; i++){
            dp[i] = -1;
        }

        for (int i = 0; i < coins.length; i++){
            if (coins[i] <= amount){
                dp[coins[i]] = 1;
            }
        }

        for (int i = 0; i <= amount; i++){
            for (int coin : coins) {
                if (coin < i && dp[i - coin] != -1) {
                    if (dp[i] == -1){
                        dp[i] = dp[i - coin] + 1;
                    }
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1};
        System.out.println(new Solution322().coinChange(coins,0 ));
    }
}
