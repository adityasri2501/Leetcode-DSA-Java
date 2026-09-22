class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length < 3) {
            for (int num : nums) {
                if(!list.contains(num)){
                    list.add(num);
                }
            }
            return list;
        }
        int num1 = nums[0], num2 = nums[1], count1 = 0, count2 = 0, n = nums.length;
        for(int i: nums){
            if(i == num1){
                count1++;
            } else if(i == num2){
                count2++;
            } else if(count1 == 0){
                num1 = i;
                count1 = 1;
            } else if(count2 == 0){
                num2 = i;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i : nums) {
            if (i == num1) {
                count1++;
            }
            else if (i == num2) {
                count2++;
            }
        }

        if (count1 > n / 3) {
            list.add(num1);
        }

        if (count2 > n / 3) {
            list.add(num2);
        }


        return list;
    }
}