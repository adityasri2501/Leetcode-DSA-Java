class Solution {
    public boolean canAliceWin(int n) {

        if( n < 10){
            return false;
        }

        int a = 10, b = a - 1;
        n -= a;
        boolean adone = true;
        System.out.println("a done = " + adone);
        System.out.println("a val = " + a);
        System.out.println("b val = " + b);
        System.out.println("n val = " + n);
        while (true) {
            System.out.println("=================================================");
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
            System.out.println("a done = " + adone);
            System.out.println("a val = " + a);
            System.out.println("b val = " + b);
            System.out.println("n val = " + n);
        }

        System.out.println("a done = " + adone);
        return (adone ? true : false);
    }
}