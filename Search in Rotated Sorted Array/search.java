public class search {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2, ans = -1, lowest_index = 0, highest_index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[lowest_index]) {
                lowest_index = i;
            } else if (arr[i] > arr[highest_index]) {
                highest_index = i;
            }
        }

        boolean found = false;
        int mid = 0;

        if (target >= arr[0] && target <= arr[highest_index]) {
            int low = 0, high = highest_index;
            while (low <= high) {
                mid = Math.floorDiv(low + high, 2);
                if (arr[mid] == target) {
                    found = true;
                    ans = mid;
                    break;
                } else if (target > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        } else {
            int low = lowest_index, high = arr.length - 1;
            while (low <= high) {
                mid = Math.floorDiv(low + high, 2);
                if (arr[mid] == target) {
                    found = true;
                    ans = mid;
                    break;
                } else if (target > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        if (found) {
            System.out.println(ans);
        } else {
            System.out.println(ans);
        }

        // class Solution {
        //     public int search(int[] arr, int target) {
        //         int low = 0;
        //         int high = arr.length - 1;

        //         while (low <= high) {

        //             int mid = low + (high - low) / 2;

        //             if (arr[mid] == target) {
        //                 return mid;
        //             }

        //             // Left half is sorted
        //             if (arr[low] <= arr[mid]) {

        //                 if (arr[low] <= target && target < arr[mid]) {
        //                     high = mid - 1;
        //                 } else {
        //                     low = mid + 1;
        //                 }

        //             }

        //             // Right half is sorted
        //             else {

        //                 if (arr[mid] < target && target <= arr[high]) {
        //                     low = mid + 1;
        //                 } else {
        //                     high = mid - 1;
        //                 }
        //             }
        //         }

        //         return -1;
        //     }
        // }

    }
}
