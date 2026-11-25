class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int a) {
        int sum = 0, x = a;
        while(x > 0){
            sum += (x%10);
            x /= 10;
        }

        return ((a % sum == 0) ? sum : - 1);
    }
}