class Solution {

    public boolean check(int n){
        if(n == 0){
            return false;
        } else if(n == 1){
            return true;
        }

        return (n % 2 == 0) && check(n/2);
    }

    public boolean isPowerOfTwo(int n) {

        if(n < 0){
            return false;
        }

        return check(n);
    }
}