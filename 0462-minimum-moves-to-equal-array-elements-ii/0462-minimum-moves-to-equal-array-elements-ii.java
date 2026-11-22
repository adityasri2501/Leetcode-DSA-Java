class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = 0;
        if(nums.length % 2 == 0){
            int first = nums.length / 2 - 1;
            int second = first + 1;
            median = Math.floorDiv(nums[first]+nums[second], 2);
        } else {
            median = nums[((nums.length + 1) / 2) - 1];
        }
        // System.out.println("median = " + median);

        int count = 0;
        for(int i : nums){
            count += Math.abs(i - median);
        }

        return count;
    }
}