import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        int []arr = {4,6,1,12,8,9,13};
        int n = arr.length;
        int []arr_even = new int[n/2];
        int []arr_odd = new int[n/2];
        for (int i = 0, j = 0, k = 0; i<arr.length && j < arr_even.length && k < arr_odd.length ;i++, j++, k++){
            if(i%2==0){
                arr_even[j] = arr[i];
            } else {
                arr_odd[k] = arr[i];
            }
        }
        Arrays.sort(arr_even);
        Arrays.sort(arr_odd);
        System.out.println(Arrays.toString(arr_even));
        System.out.println(Arrays.toString(arr_odd));
        for (int i = 0, j = 0, k = 0; i<arr.length && j < arr_even.length && k < arr_odd.length ;i++, j++, k++){
            if(i%2==0){
                arr[i] = arr_even[j];
            } else {
                arr[i] = arr_odd[k];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
