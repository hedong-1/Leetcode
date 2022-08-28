public class Solution50 {
    public double myPow(double x, int n) {
        long b = n;
        if (b < 0){
            b = -b;
            x = 1/x;
        }
        double ans = 1;
        while (b > 0){
            if ((b & 1) == 1) ans *= x;
            x *= x;
            b >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution50().myPow(2, 10));
    }
}
