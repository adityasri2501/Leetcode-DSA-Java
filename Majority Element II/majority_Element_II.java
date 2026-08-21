import java.util.ArrayList;
import java.util.List;

class Solution_ME_II {
    public List<Integer> majorityElement_II(int[] nums) {
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

        if(count1 > Math.floorDiv(n,3)){
            list.add(num1);
        }
        if(count2 > Math.floorDiv(n,3)){
            list.add(num2);
        }

        System.out.println(list);
        return list;
    }
}

public class majority_Element_II {
    public static void main(String[] args) {
        Solution_ME_II solution = new Solution_ME_II();
        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
// Expected: [1, 2]
        System.out.println(solution.majorityElement_II(nums));
    }
}
