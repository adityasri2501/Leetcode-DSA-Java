class Solution_MaxPro_Three {
    public int maxPro(int[] n) {
        if (n.length <= 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE,
                third_max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sec_min = Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                third_max = sec_max;
                sec_max = max;
                max = n[i];
            } else if (n[i] > sec_max) {
                third_max = sec_max;
                sec_max = n[i];
            } else if (n[i] > third_max) {
                third_max = n[i];
            }
            if (n[i] < min) {
                sec_min = min;
                min = n[i];
            } else if (n[i] < sec_min) {
                sec_min = n[i];
            }
        }
        if (max * sec_max * third_max > max * min * sec_min) {
            return max * sec_max * third_max;
        } else {
            return max * min * sec_min;
        }
    }
}