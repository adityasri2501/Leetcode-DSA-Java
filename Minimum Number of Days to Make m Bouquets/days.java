public class days {
    public static void main(String[] args) {
        int[] bloomDay = { 1000000000,1000000000 };
        int m = 1, k = 1, min = bloomDay[0], max = bloomDay[0];
        for (int i : bloomDay) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int low = min, high = max, mid = 0, flower = 0, bouquet = 0, prev = 0;
        boolean prev_bouquet = false, mid_bouquet = false;
        while (low <= high) {
            bouquet = 0;
            flower = 0;
            mid = Math.floorDiv(low + high, 2);
            for (int i = 0; i < bloomDay.length; i++) {
                if (bloomDay[i] <= mid) {
                    flower++;
                    if (flower == k) {
                        bouquet++;
                        flower = 0;
                    }
                } else {
                    flower = 0;
                }
            }
            if (bouquet == m) {
                high = mid - 1;
                prev = mid;
                prev_bouquet = true;
                mid_bouquet = true;
            } else {
                low = mid + 1;
                mid_bouquet = false;
            }
        }

        if (mid_bouquet) {
            System.out.println(mid);
        } else if (prev_bouquet) {
            System.out.println(prev);
        } else {
            System.out.println(-1);
        }
    }
}
