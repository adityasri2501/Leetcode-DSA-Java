class Solution {
    public int maxProfit(int[] p) {

        int buy = p[0], max = 0;
        for (int i = 1; i < p.length; i++) {
            if (p[i] <= buy) {
                buy = p[i];
            } else {
                max += p[i] - buy;
                buy = p[i];
            }
        }

        return max;
    }
}