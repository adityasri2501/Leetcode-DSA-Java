public class Solution_ME{
    public int majorityElement(int []nums){

        // Using HashMap

    //     HashMap<Integer, Integer> set = new HashMap<>();
    //     int element = 0; // since in question there is one majority element 
    //     for(int i : nums){
    //         set.put(i, set.getOrDefault(i, 0)+1);
    //         if(set.getOrDefault(i, 0) > Math.floorDiv(nums.length, 2)){
    //             element = i;
    //             break;
    //         }
    //     }
    //     return element;

        // Boyer Moore Algorithm

        int element = nums[0], count = 0;
        for(int i : nums){
            if(i == element || count == 0){
                element = i;
                count ++;
            } else{
                count --;
            }
        }
        return element;
    }
}