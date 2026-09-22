class Solution {
    public int missingNumber(int[] nums) {
        boolean pre[] = new boolean[nums.length + 1];
        int miss = -1;
        for(int i : nums){
            pre[i] = true;
        }

        for(int i = 0; i < pre.length; i++){
            if(pre[i] == false){
                miss = i;
                break;
            }
        }

        return miss;
    }
}