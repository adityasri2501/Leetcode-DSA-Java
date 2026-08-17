class Solution_CWMW{
    public int maxArea(int arr[]){
        int i = 0, j = arr.length-1, max = 0;
        while(i<j){
            if(Math.min(arr[i], arr[j])*(j-i) > max){
                max = Math.min(arr[i], arr[j])*(j-i);
            }
            if(arr[i] < arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}