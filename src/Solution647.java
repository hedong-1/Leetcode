public class Solution647 {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;
        for (int j = 0 ; j < s.length(); j++)
            for (int i = 0; i <= j; i++){
                if (i == j){
                    dp[i][j] = true;
                    ans++;
                }else if (j-i == 1 && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = true;
                    ans++;
                }else if (dp[i+1][j-1] && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = true;
                    ans++;
                }
            }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution647().countSubstrings("aaa"));
    }
}
