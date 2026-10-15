class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0, right = (long) Math.floor(Math.sqrt(c));
        // System.out.println("square root = " + right);
        // System.out.println("max value = " + Integer.MAX_VALUE);

        while (left <= right) {
            // System.out.println("left = " + left);
            // System.out.println("left sq = " + left*left);
            // System.out.println("right = " + right);
            // System.out.println("right sq = " + right*right);
            // System.out.println("sum = " + (left * left) + (right * right));
            if (((left * left) + (right * right)) == c) {
                return true;
            } else if (((left * left) + (right * right)) < c) {
                left++;
            } else {
                right--;
            }
            // System.out.println("=====================================================");
        }

        return false;
    }
}