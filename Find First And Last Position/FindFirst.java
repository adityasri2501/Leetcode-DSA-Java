class Solution {
    public int[] searchRange(int[] arr, int target) {

        int[] ans = { -1, -1 };

        if (arr.length == 1) {
            if (arr[0] == target) {
                ans[0] = 0;
                ans[1] = 0;
                return ans;
            } else {
                return ans;
            }
        }

        if (arr.length < 1) {
            return ans;
        }

        int low = 0, high = arr.length - 1, mid = 0;

        // Starting index

        while (low <= high) {
            mid = Math.floorDiv(low + high, 2);
            if (low <= arr.length - 1 && high >= 0) {
                if (arr[mid] == target) {
                    ans[0] = mid;
                    high = mid - 1;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                break;
            }
        }

        low = ans[0];
        high = arr.length - 1;

        // last index

        while (low <= high) {
            mid = Math.floorDiv(low + high, 2);
            if (low <= arr.length - 1 && high >= 0) {
                if (arr[mid] == target) {
                    ans[1] = mid;
                    low = mid + 1;
                } else if (arr[mid] < target) {
                    low = mid + 1;

                } else {
                    high = mid - 1;
                }
            } else {
                break;
            }
        }

        return ans;
    }
}