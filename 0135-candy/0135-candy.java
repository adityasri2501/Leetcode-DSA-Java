class Solution {
    public int candy(int[] r) {

        int left = 0, right = 1;

        int[] count = new int[r.length];

        Arrays.fill(count, 1);

        while (right < r.length) {
            // System.out.println("left = " + r[left]);
            // System.out.println("right = " + r[right]);
            if (r[right] > r[left]) {
                count[right] = count[left] + 1;
                // System.out.println("val = " + count[right]);
                // System.out.println("count Increase as right greater");
            }
            left++;
            right++;
        }
        // System.out.println("=============================================");

        left = r.length - 2;
        right = r.length - 1;

        while (left >= 0) {
            // System.out.println("left = " + r[left]);
            // System.out.println("right = " + r[right]);
            if (r[left] > r[right]) {
                count[left] = Math.max(count[left], count[right] + 1);
                // System.out.println("val = " + count[left]);
                // System.out.println("count Increase as left greater");
            }
            left--;
            right--;
        }

        int ans = 0;

        for (int i = 0; i < count.length; i++) {
            // System.out.println("val = " + count[i]);
            ans += count[i];
        }

        return ans;

    }
}