class Solution {
    public boolean canAliceWin(int n) {

        if( n < 10){
            return false;
        }

        int a = 10, b = a - 1;
        n -= a;
        boolean adone = true;
        while (true) {
            if (adone == false){
                if(n - a < 0){
                    break;
                }
                adone = true;
                n -= a;
                b = a - 1;
            } else if (adone){
                if(n - b < 0){
                    break;
                }
                adone = false;
                n -= b;
                a = b - 1;
            }
        }
        return (adone ? true : false);
    }
}