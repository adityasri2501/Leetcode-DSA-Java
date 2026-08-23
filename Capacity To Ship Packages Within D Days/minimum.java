public class minimum {
    public static void main(String[] args) {
        int[] weights = { 3, 2, 2, 4, 1, 4 };
        int days = 3, low = weights[0], high = 0;
        for (int i : weights) {
            low = Math.max(low, i);
            high += i;
        }

        int mid = 0, curr_count = 0, count = 0, curr_sum = 0, prev = 0;
        boolean prev_count = false, mid_count = false;
        
        while (low <= high) {
            count = 0;
            curr_sum = 0;
            curr_count = 0;
            mid = Math.floorDiv(low + high, 2);
            for (int i = 0; i < weights.length; i++) {
                if (curr_sum + weights[i] <= mid) {
                    curr_sum += weights[i];
                    curr_count++;
                    if (i == weights.length - 1) {
                        count++;
                    }
                } else {
                    i--;
                    count++;
                    curr_sum = 0;
                    curr_count = 0;
                }
            }
            if (count <= days) {
                prev = mid;
                prev_count = true;
                mid_count = true;
                high = mid - 1;
            } else {
                mid_count = false;
                low = mid + 1;
            }
        }

        if (mid_count) {
            System.out.println(mid);
        } else if (prev_count) {
            System.out.println(prev);
        } else {
            System.out.println(-1);
        }
    }
}
