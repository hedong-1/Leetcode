public class Solution29 {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        if (divisor == -1){
            if (dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
            else return -dividend;
        }
        long a = dividend;
        long b = divisor;
        a = a>0 ? a : -a;
        b = b>0 ? b : -b;
        int sign = 1;
        if ((dividend<0 && divisor>0) || (dividend>0 && divisor<0)) sign = -1;

        int res = div(a, b);
        return sign<0 ? -res : res;
    }

    private int div(long dividend, long divisor) {
        if (dividend < divisor) return 0;
        int count = 1;
        long b = divisor;
        while ((b+b) <= dividend){
            count += count;
            b += b;
        }
        return count+div(dividend-b,divisor);
    }

    public static void main(String[] args) {
        System.out.println("new Solution29().divide(60,-9) = " + new Solution29().divide(-2147483648, 2));
    }
}
