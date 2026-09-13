class Solution {

    public double find(double x, long n) {
        if (n == 1) {
            return x;
        } else if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            double res = (find(x, (n) / 2));
            return res * res;
        } else {
            double res = (find(x, (n - 1) / 2));
            return x * res * res;
        }

    }

    public double myPow(double x, int n) {
        long ex = Math.abs((long)n);
        double ans = 0;
        boolean rec = false, even = false;

        if (n < 0) {
            rec = true;
        }

        if(n % 2 == 0){
            even = true;
        }

        if (n % 2 == 0) {
            ans = find(x, ex / 2);
        } else {
            ans = find(x, (ex - 1)/ 2);
        }

        if(even){
            if (rec) {
                return (1 / (ans*ans));
            } else {
                return ans*ans;
            }
        } else{
            if (rec) {
                return (1 / (x*ans*ans));
            } else {
                return x*ans*ans;
            }
        }
    }
}