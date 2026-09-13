class Solution {
    public int searchInsert(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        if (arr.length == 1) {
            if (arr[0] >= target) {
                return 0;
            } else {
                return 1;
            }
        }

        while (low <= high) {
            int mid = Math.floorDiv(low + high, 2);
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return low;
    }
}