public class verticalSum {
    public static void main(String[] args) {
        int arr[][] = {
            {2, 3, 5},
            {1, 2},
            {1, 4, 5, 1}
        };
        int size = arr.length, MR = 0;
        for(int i = 0; i < size; i++){
            MR = Math.max(arr[i].length, MR);
            System.out.println(MR);
        }
    }
}
