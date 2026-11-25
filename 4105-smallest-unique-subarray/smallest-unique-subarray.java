import java.util.*;

class Solution {

    public long power(long base, int exp, long mod) {
        long result = 1;

        for (int i = 0; i < exp; i++) {
            result = (result * base) % mod;
        }

        return result;
    }

    public long newhash(long hash, int val, long base, long mod) {
        return (hash * base + val) % mod;
    }

    public long uphash(long hash, int old, int pre,
                       long power, long base, long mod) {

        hash = (hash - (old * power) % mod + mod) % mod;
        hash = (hash * base + pre) % mod;

        return hash;
    }

    public int smallestUniqueSubarray(int[] nums) {

        int low = 1;
        int high = nums.length;
        int res = nums.length;

        HashMap<String, Integer> map = new HashMap<>();

        long base1 = 100003;
        long base2 = 100019;

        long mod1 = 1_000_000_007;
        long mod2 = 1_000_000_009;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            boolean found = false;

            long hash1 = 0;
            long hash2 = 0;

            // Calculate initial window hash
            for (int i = 0; i < mid; i++) {
                hash1 = newhash(hash1, nums[i], base1, mod1);
                hash2 = newhash(hash2, nums[i], base2, mod2);
            }

            // Precompute outgoing element contribution
            long power1 = power(base1, mid - 1, mod1);
            long power2 = power(base2, mid - 1, mod2);

            // Store first window
            String key = hash1 + "#" + hash2;
            map.put(key, 1);

            // Sliding window
            for (int i = mid; i < nums.length; i++) {

                hash1 = uphash(
                    hash1, nums[i - mid], nums[i],
                    power1, base1, mod1
                );

                hash2 = uphash(
                    hash2, nums[i - mid], nums[i],
                    power2, base2, mod2
                );

                key = hash1 + "#" + hash2;

                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            // Check if any window occurs exactly once
            for (int count : map.values()) {
                if (count == 1) {
                    found = true;
                    res = mid;
                    break;
                }
            }

            map.clear();

            if (found) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }
}