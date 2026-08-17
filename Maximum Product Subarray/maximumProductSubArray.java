class Solution_MPSA{
    public int maxPro(int []nums){
        int product = nums[0], min = nums[0], max = nums[0], curr_max = nums[0], new_max = nums[0], new_min = nums[0];
        for(int i = 1; i < nums.length; i++){
            new_max = Math.max(nums[i], Math.max(max*nums[i], min*nums[i]));
            new_min = Math.min(nums[i], Math.min(max*nums[i], min*nums[i]));
            curr_max = Math.max(new_max, new_min);
            product = Math.max(product, curr_max);
            max = new_max;
            min = new_min;
        }
        return product;
    }
}

