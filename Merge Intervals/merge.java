import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {
    public static void main(String[] args) {
        // int [][] arr = {
        // {1,4},
        // {2,6},
        // {3,5}
        // };

        int[][] arr = {
                {1,3},
                {2,6},
                {8,10},
                {9,12}
        };
        if (arr.length < 2) {
            System.out.println(arr);
        } else {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
            
            int start = arr[0][0], prev = arr[0][1];
            for (int i = 1; i < arr.length; i++) {
                int current = arr[i][0];
                if (current <= prev) {
                    prev = Math.max(prev, arr[i][1]);
                } else {
                    list.add(new ArrayList<>(List.of(start, prev)));
                    start = arr[i][0];
                    prev = arr[i][1];
                }
            }
            list.add(new ArrayList<>(List.of(start, prev)));
            System.out.println(list);
        }
    }
}
