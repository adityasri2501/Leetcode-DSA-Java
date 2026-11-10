class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ans = new HashSet<>();
        HashSet<Integer> got = new HashSet<>();

        // int j = 0;
        // boolean found = false, first = false;

        // for (int i = 0; i < nums1.length && j < nums2.length; i++) {
        //     if (first && !found) {
        //         break;
        //     }
        //     if (nums1[i] == nums2[j]) {
        //         found = true;
        //         if (!ans.isEmpty() && nums1[i] == ans.get(ans.size() - 1)) {
        //             j++;
        //             continue;
        //         }
        //         ans.add(nums1[i]);
        //         j++;
        //     }
        //     if (found) {
        //         first = true;
        //     }
        // }

        for (int i = 0; i < nums1.length; i++) {
            ans.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            // System.out.println("j = " + nums2[j]);
            if (ans.contains(nums2[j])) {
                // System.out.println("Found");
                got.add(nums2[j]);
            }
            // System.out.println("---------------------------------------");
        }

        int res[] = new int[got.size()];
        int k = 0;
        for (int i : got) {
            // System.out.println("i = " + i);
            res[k] = i;
            k++;
        }

        return res;

    }
}