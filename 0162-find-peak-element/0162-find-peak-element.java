class Solution {
    public int findPeakElement(int[] nums) {
        // int peak = -1;

        if(nums.length == 1){
            return 0;
        }

        int low = 0, high = nums.length - 1;

        while(low <= high){
            int mid = Math.floorDiv(low+high, 2);
            boolean left = false, right = false;

            if(mid - 1 < 0){
                left = true;
            } else if(nums[mid] > nums[mid - 1]){
                left = true;
            }

            if(mid + 1 >= nums.length){
                right = true;
            }else if(nums[mid] > nums[mid + 1]){
                right = true;
            }

            if(left && right){
                return mid;
            }

            if(left && !right){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}