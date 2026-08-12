import java.util.ArrayList;
import java.util.List;

class Solution_ME_II {
    public List<Integer> majorityElement_II(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length < 3) {
            for (int num : nums) {
                list.add(num);
            }
            return list;
        }
        int element = nums[0], count = 0, target = 0;
        for (int i : nums) {
            if (i == element) {
                element = i;
                count++;
                if (count > Math.floorDiv(nums.length, 3)) {
                    count = 0;
                    target = element;
                    list.add(i);
                    break;
                }
            } else {
                count--;
            }
        }

        for (int i:nums){
            if (i != target){
                element = i;
                break;
            }
        }

        for (int i : nums) {
            if (i == target) {
                continue;
            } else {
                if (i == element) {
                    element = i;
                    count++;
                    if (count > Math.floorDiv(nums.length , 3)) {
                        count = 0;
                        list.add(i);
                        break;
                    }
                } else {
                    count--;
                    if (count < 0) {
                        count = 0;
                    }
                }
            }
        }
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
