class Solution {

    public boolean check(int sum){
        int count = 0;
        while(sum > 0){
            sum /= 10;
            count++;
        }
        return (count == 1 ? true : false);
    }

    public int add(int val) {
        int sum = 0;
        while(val > 0){
            sum += (val % 10);
            val /= 10;
        }
        return (check(sum) ? sum : add(sum));
    }

    public int addDigits(int num) {
        return (num == 0 ? 0 : add(num));
    }
}