public class Solution416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        if (nums.length == 1)   return false;
        for (int i: nums){
            sum += i;
        }
        if (sum % 2 == 1){
            return false;
        }else {
            boolean[][] dp = new boolean[nums.length][sum + 1];
            dp[0][nums[0]] = true;
            for (int i = 1; i < nums.length; i++)
                for (int j = 1; j <= sum/2; j++) {
                    if (j == nums[i]){
                        dp[i][j] = true;
                    }
                    if (j > nums[i]){
                        dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                    }else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            return dp[nums.length - 1][sum/2];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new Solution416().canPartition(nums));
    }

}
