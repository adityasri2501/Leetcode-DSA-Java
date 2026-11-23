class Solution {

    public void reverse(int arr[], int left, int right){
        while(left < right){
            
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] arr, int d) {
        d %= arr.length;
        reverse(arr, arr.length - d, arr.length - 1);
        reverse(arr, 0, arr.length -d - 1);
        reverse(arr, 0, arr.length - 1);
    }
}
