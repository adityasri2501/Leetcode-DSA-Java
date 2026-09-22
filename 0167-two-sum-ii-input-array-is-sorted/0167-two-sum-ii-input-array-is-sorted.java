class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            arr[0] = i + 1;

            int low = i, high = numbers.length - 1, new_tar = target - numbers[i];
            boolean found = false;

            while (low <= high) {
                int mid = Math.floorDiv(low + high, 2);
                if (numbers[mid] == new_tar) {
                    if (mid + 1 == i + 1) {
                        low = mid + 1;
                    } else {
                        arr[1] = mid + 1;
                        found = true;
                        break;
                    }
                } else if (numbers[mid] < new_tar) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if (found) {
                break;
            }
        }
        return arr;
    }
}