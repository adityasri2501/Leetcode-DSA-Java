class Solution {

    public int check(int curr, int dest, int[] nums, int[] dp) {
        if (curr == dest) {
            return 1;
        } else if (curr > dest) {
            return -1;
        }

        if (dp[curr] == 1) {
            return 1;
        } else if (dp[curr] == -1) {
            return -1;
        }

        int element = nums[curr];
        if (element == 0) {
            return -1;
        }
        while (element > 0) {

            if (curr + element > dest) {
                element--;
            } else {
                dp[curr] = check(curr + element, dest, nums, dp);
                if (dp[curr] == 1) {
                    break;
                }
                element--;
            }
        }
        return dp[curr];
    }

    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        int ans = check(0, nums.length - 1, nums, dp);
        if (ans == 1) {
            return true;
        } else {
            return false;
        }
    }
}