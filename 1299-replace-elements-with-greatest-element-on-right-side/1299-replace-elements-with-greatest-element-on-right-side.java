class Solution {
    public int[] replaceElements(int[] nums) {

        if(nums.length < 2){
            nums[0] = -1;
            return nums;
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(nums[nums.length - 1]);

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= res.get(0)) {
                res.add(0, nums[i]);
            }
        }

        for (int i = 0, j = 0; i < nums.length - 1; i++) {
            if (res.get(j) == nums[i]) {
                j++;
            }
            nums[i] = res.get(j);
        }

        nums[nums.length - 1] = -1;
        return nums;
    }
}