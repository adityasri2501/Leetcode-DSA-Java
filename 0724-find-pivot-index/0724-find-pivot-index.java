class Solution {
    public int pivotIndex(int[] nums) {
        // if(nums.length < 3){
        //     return -1;
        // }

        int pivot = -1, sum = 0;
        for(int i : nums){
            sum += i;
        }

        int lsum = 0, left = 0, rsum = sum;

        while(left < nums.length){
            rsum -= nums[left];
            if(lsum == rsum){
                pivot = left;
                break;
            }

            lsum += nums[left];
            left++;
        }
        return pivot;
    }
}