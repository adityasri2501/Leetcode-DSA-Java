class Solution {
    public int maxProfit(int[] p) {

        // 0 1 2 3 4 5
        // 7 1 5 3 6 4

        int buy = p[0], max = 0;
        for (int i = 1; i < p.length; i++) {
            System.out.print(" --- i = " + i + " --- ");
            if (p[i] <= buy) {
                buy = p[i];
                System.out.println("buy = " + buy + " --- ");
            } else {
                System.out.print("buy = " + buy + " --- ");
                System.out.print("sell = " + p[i] + " --- ");
                max += p[i] - buy;
                System.out.println("profit = " + max + " --- ");
                buy = p[i];
                // i--;
            }
        }

        return max;
    }
}