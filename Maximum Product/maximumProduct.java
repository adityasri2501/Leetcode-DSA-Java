class Solution_MaxPro {
    public int maxProduct(int n) {

        // Brute Force

        // int[] res = new int[String.valueOf(n).length()];
        // int max_pro = 0, i = 0, digit, max_val = 0, sec_max_val = 0;
        // while (n > 0) {
        //     digit = n % 10;
        //     n /= 10;
        //     res[i] = digit;
        //     i++;
        // }
        // for (i = 0; i < res.length; i++) {
        //     if (res[i] >= max_val) {
        //         sec_max_val = max_val;
        //         max_val = res[i];
        //     } else if (res[i] >= sec_max_val) {
        //         sec_max_val = res[i];
        //     }
        //     max_pro = max_val * sec_max_val;
        // }
        // return max_pro;

        // Optimised solution

        if (n < 10) {
            return n;
        }
        int max_pro = 0, digit, max_val = 0, sec_max_val = 0;
        while (n > 0) {
            digit = n % 10;
            n /= 10;
            if (digit >= max_val) {
                sec_max_val = max_val;
                max_val = digit;
            } else if (digit >= sec_max_val) {
                sec_max_val = digit;
            }
            max_pro = max_val * sec_max_val;
        }
        return max_pro;
    }
}