import java.util.Arrays;

public class Solution_MZ {
    public void MoveZeros(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (j+1 != i) {
                    nums[j + 1] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}