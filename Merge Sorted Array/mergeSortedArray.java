class Solution_MSA {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while ((i < m || j < n) && k < m + n) {
            if (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    res[k] = nums1[i];
                    k++;
                    i++;
                } else if (nums1[i] == nums2[j]) {
                    res[k] = nums1[i];
                    res[k + 1] = nums2[j];
                    k += 2;
                    i++;
                    j++;
                } else {
                    res[k] = nums2[j];
                    k++;
                    j++;
                }
            } else if (i == m) {
                System.arraycopy(nums2, j, res, k, n - j);
                break;
            } else if (j == n) {
                System.arraycopy(nums1, i, res, k, m - i);
                break;
            }
        }
        System.arraycopy(res, 0, nums1, 0, m + n);
    }
}
