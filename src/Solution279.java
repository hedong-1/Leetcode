public class Solution279 {
    public int numSquares(int n) {
        int[] min = new int[n + 1];
        for (int i = 1; i <= n; i++){
            int temp = 10001;
            for (int j = 1; j*j <= i; j++){
                temp = Math.min(temp, min[i - j*j]);
            }
            min[i] = temp + 1;
        }
        return min[n];
    }
}
