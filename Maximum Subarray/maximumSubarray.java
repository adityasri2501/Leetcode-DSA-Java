class Solution_MS{
    public int maxSubArray(int []arr){
        int sum = arr[0], curr_sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            curr_sum = Math.max(arr[i], arr[i]+curr_sum);
            sum = Math.max(sum, curr_sum);
        }
        return sum;
    }
}
