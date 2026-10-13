class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);

        int left = 0, curr = 0, right = nums.length - 1;

        while(curr <= right){

            // System.out.println(nums);

            if(nums[curr] == 2){
                int temp = nums[curr];
                nums[curr] = nums[right];
                nums[right] = temp;
                right--;
            } else if(nums[curr] == 0){
                int temp = nums[curr];
                nums[curr] = nums[left];
                nums[left] = temp;
                left++;
                curr++;
            } else {
                curr++;
            }
        }
    }
}