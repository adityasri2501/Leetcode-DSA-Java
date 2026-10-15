class Solution {
    public int maxScore(int[] c, int k) {

        if (k == c.length) {
            int sum = 0;
            for (int i : c) {
                sum += i;
            }
            return sum;
        }

        int left = 0, right = c.length;
        int res = 0;

        for (int i = c.length - 1; i >= 0; i--) {
            if (i >= c.length - k) {
                res += c[i];
                right--;
            } else {
                break;
            }
        }

        int ans = res;

        while (left < k) {
            if (res + c[left] - c[right] >= ans) {
                ans = res + c[left] - c[right];
            }
            res = res + c[left] - c[right];
            left++;
            right++;
        }
        return ans;
    }
}