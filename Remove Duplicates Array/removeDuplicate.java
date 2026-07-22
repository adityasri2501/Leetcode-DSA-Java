class Solution_Rd {
    public int removeDuplicate(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                nums[k + 1] = nums[i];
                k += 1;
            }
        }
        return k + 1;
    }
}