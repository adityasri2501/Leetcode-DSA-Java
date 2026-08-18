class Solution_PES {
    public int[] maxProduct(int[] nums) {
        int[] res = new int[nums.length];
        int prod = nums[0], prod_without_zero = nums[0], zero_count = 0;
        if(prod_without_zero == 0){
            prod_without_zero = 1;
            zero_count++;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                prod *= nums[i];
                zero_count++;
            } else {
                prod_without_zero *= nums[i];
                prod *= nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zero_count > 1) {
                    res[i] = prod;
                } else {
                    res[i] = prod_without_zero;
                }
            } else {
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}