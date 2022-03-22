public class Solution5 {
    public String longestPalindrome(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        int i,j;
        int max = 1;
        String ans = null;
        int begin = 0,end = 0;

        for (i = 0; i < len; i++){
            dp[i][i] = 1;
            begin = i;
            end = i;
        }

        for (i = 0; i < len-1; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = 1;
                max = 2;
                begin = i;
                end = i+1;
            }else {
                dp[i][i+1] = 0;
            }
        }

        for (i = 2; i < len; i++){
            for (j = 0; j < len-i ; j++){
                if (dp[j+1][i+j-1] == 1 && s.charAt(j)==s.charAt(i+j)){
                    dp[j][i+j] = 1;
                    max = Math.max(max,i+1);
                    begin = j;
                    end = i+j;
                }else {
                    dp[j][i+j] = 0;
                }
            }
        }

        return s.substring(begin,end+1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution5().longestPalindrome("ac"));

    }
}
