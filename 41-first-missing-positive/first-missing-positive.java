class Solution {
    public int firstMissingPositive(int[] nums) {

        if (nums.length < 2) {
            if (nums[0] == 1) {
                return 2;
            } else {
                return 1;
            }
        }

        int i = 0;
        while (i < nums.length) {

            if (nums[i] > nums.length || nums[i] < 1 || nums[nums[i] - 1] == nums[i]) {
                i++;
            } else{
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j]) {
                return j + 1;
            }
        }
        return nums.length + 1;
    }
}