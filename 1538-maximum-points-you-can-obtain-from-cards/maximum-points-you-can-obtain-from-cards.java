class Solution {

    public int check(int left, int right, int[] c) {
        if (right < 0 || c[left] > c[right]) {
            return 1;
        } else if (left > c.length - 1 || c[left] < c[right]) {
            return 2;
        }

        return check(left - 1, right - 1, c);
    }

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
        System.out.println("ans = " + ans);
        System.out.println("======================================================");

        while (left < k) {
            if (res + c[left] - c[right] >= ans) {
                ans = res + c[left] - c[right];
                System.out.println("ans = " + ans);
            }

            System.out.println("left = " + left);
            System.out.println("right = " + right);
            System.out.println("left val = " + c[left]);
            System.out.println("right val = " + c[right]);
            res = res + c[left] - c[right];
            System.out.println("res = " + res);
            left++;
            right++;
            System.out.println("======================================================");
        }
        return ans;
    }
}