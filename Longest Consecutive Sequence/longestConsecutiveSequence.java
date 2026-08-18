import java.util.HashSet;

class Solution_LCS {
    public int sequence(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0, max_count = 0, element = 0;
        for (int i : nums) {
            set.add(i);
        }
        for (int i : set) {
            count = 1;
            element = i;
            if (set.contains(element - 1)) {
                continue;
            }
            while (set.contains(element + 1)) {
                count++;
                element++;
            }
            max_count = Math.max(max_count, count);
            count = 0;
        }
        return max_count;
    }
}