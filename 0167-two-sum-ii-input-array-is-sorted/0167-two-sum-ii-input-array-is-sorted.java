class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();


        int arr[] = new int[2];

        for(int i = 0; i < numbers.length; i++){
            map.put(numbers[i], i);
        }

        // System.out.println(map);

        for(int i = 0; i< numbers.length; i++){
        // System.out.println(numbers[i]);
            if(map.containsKey(target - numbers[i])){
                arr[0] = i+1;
                arr[1] = map.get(target - numbers[i]) + 1;
                break;
            }
        }
        return arr;
    }
}