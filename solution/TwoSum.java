import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int find = target - nums[i];
            if (map.containsKey(find)){
                return new int[] {map.get(find), i};
            } else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}