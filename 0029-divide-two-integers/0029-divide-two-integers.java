class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long dend = Math.abs((long) dividend);
        long div = Math.abs((long) divisor);

        long count = 0;

        while (dend >= div) {

            long temp = div;
            long multiple = 1;

            while (dend >= (temp << 1)) {
                temp = temp << 1;
                multiple = multiple << 1;
            }

            dend -= temp;
            count += multiple;
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            return (int) -count;
        }

        return (int) count;
    }
}