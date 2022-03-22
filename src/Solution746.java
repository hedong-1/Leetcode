public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++){
            if (dp[i-1] + cost[i-1] < dp[i-2] + cost[i-2]){
                dp[i] = dp[i-1] + cost[i-1];
            }else {
                dp[i] = dp[i-2] + cost[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(new Solution746().minCostClimbingStairs(cost));
    }
}
