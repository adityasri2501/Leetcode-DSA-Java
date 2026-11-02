class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, left = 0, right = 0, ans = Integer.MAX_VALUE;

        while (left < nums.length) {
            if (sum < target && right < nums.length) {
                sum += nums[right];
                if (sum >= target) {
                    ans = Math.min(ans, right - left + 1);
                }
                right++;
            } else {
                sum -= nums[left];
                left++;
                if (sum >= target) {
                    ans = Math.min(ans, right - left);
                }
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return 0;
        }

        return ans;
    }
}