import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution_T {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int target = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } else {
                int left = i + 1;
                int right = nums.length - 1;
                target = 0 - nums[i];
                while (left < right) {
                    if (nums[left] + nums[right] == target) {
                        ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left-1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right+1]){
                            right--;
                        }
                    } else if (nums[left] + nums[right] < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}

public class ThreeSum {
    public static void main(String[] args) {
        Solution_T solution = new Solution_T();
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(solution.threeSum(nums));
    }
}