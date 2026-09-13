class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = -1, sum = 0, ans = -1;

        for(int i : nums){
            high = Math.max(i, high);
        }

        while(low<=high){
            int mid = Math.floorDiv(low + high, 2);

            for(int i : nums){
                sum += Math.ceilDiv(i, mid);
            }

            if(sum <= threshold){
                ans = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
            sum = 0;

        }
        return ans ;
    }
}