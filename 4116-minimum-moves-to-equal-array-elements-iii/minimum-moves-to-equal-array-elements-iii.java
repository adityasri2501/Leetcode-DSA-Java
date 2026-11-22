class Solution {
    public int minMoves(int[] nums) {
        int big = 0, count = 0;
        for(int i : nums){
            big = Math.max(big, i);
        }

        for(int i : nums){
            count += big - i;
        }

        return count;
    }
}