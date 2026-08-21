import java.util.TreeMap;

public class largestElement {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int k = 2;
        int []nums = {3,2, 2,1,5,6,4};
        for(int i = 0; i< k; i++){
            map.put(nums[i],i);
        }
        for(int i = k; i< nums.length; i++){
            if (nums[i] > map.firstKey()) {
                map.put(nums[i], i);
            }
        }
        System.out.println(map);

    }
}
