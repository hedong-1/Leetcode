public class Solution70 {
    public int climbStairs(int n) {
        int[] dp = new int[10000];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
