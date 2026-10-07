class Solution {
    public int hIndex(int[] c) {

        Arrays.sort(c);

        int low = 0, high = c.length - 1;

        while (low <= high) {
            if (c[low] <= c[high]) {
                int temp = c[low];
                c[low] = c[high];
                c[high] = temp;
                low++;
                high--;
            }
        }

        int ans = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= i + 1) {
                ans = i + 1;
            } else {
                break;
            }
        }
        return ans;
    }
}