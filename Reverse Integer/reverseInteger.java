class Solution_R{
    public int reverse(int x){
        int org = x;
        int rev = 0;
        while(org != 0){
            int rem = org % 10;
            org /= 10;
            if ((rev > Integer.MIN_VALUE / 10 && rev < Integer.MAX_VALUE / 10) || (rev == Integer.MIN_VALUE/10 && rem >= -8) || (rev == Integer.MAX_VALUE/10 && rem <=7)){
                rev = rev*10+rem;
            }else {
                return 0;
            }
        }
        return rev;
    }
}

class ReverseInteger {
    public static void main(String [] args){
        Solution_R solution = new Solution_R();
        // int x = 1534236469;
        int x = -321;
        int result = solution.reverse(x);
        System.out.println(result);
    }
}
