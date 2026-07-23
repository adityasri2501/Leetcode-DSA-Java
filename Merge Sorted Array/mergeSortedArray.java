import java.util.Arrays;

class Solution_MSA {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // With extra space SC = O(n); 

        // int res[] = new int[m + n];
        // int i = 0, j = 0, k = 0;
        // while ((i < m || j < n) && k < m + n) {
        //     if (i < m && j < n) {
        //         if (nums1[i] < nums2[j]) {
        //             res[k] = nums1[i];
        //             k++;
        //             i++;
        //         } else if (nums1[i] == nums2[j]) {
        //             res[k] = nums1[i];
        //             res[k + 1] = nums2[j];
        //             k += 2;
        //             i++;
        //             j++;
        //         } else {
        //             res[k] = nums2[j];
        //             k++;
        //             j++;
        //         }
        //     } else if (i == m) {
        //         System.arraycopy(nums2, j, res, k, n - j);
        //         break;
        //     } else if (j == n) {
        //         System.arraycopy(nums1, i, res, k, m - i);
        //         break;
        //     }
        // }
        // System.arraycopy(res, 0, nums1, 0, m+n);

        // Optimised Solution with SC = O(1)
        
        int i = m-1, j = n-1, k = m+n-1;
        while((i >= 0 || j >= 0) && k >= 0){
            if(i >= 0 && j >= 0){
                if(nums1[i] > nums2[j]){
                    nums1[k] = nums1[i];
                    k--;
                    i--;
                } else if(nums1[i] == nums2[j]){
                    nums1[k] = nums1[i];
                    nums1[k-1] = nums2[j];
                    i--;
                    j--;
                    k-=2;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                    k--;
                }
            } else if (j < 0){
                break;
            } else { // i < 0
                for(int l = j; l >= 0; l--){
                    nums1[k] = nums2[l];
                    k--;
                }
                break;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}