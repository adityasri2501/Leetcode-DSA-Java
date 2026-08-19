import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        ArrayList<Integer> res = new ArrayList<>();

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right) {

            // left se right
            for (int j = left; j <= right; j++) {
                res.add(arr[top][j]);
            }
            top++;

            // top se bottom
            for (int i = top; i <= bottom; i++) {
                res.add(arr[i][right]);
            }
            right--;

            // right se left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    res.add(arr[bottom][j]);
                }
                bottom--;
            }

            // bottom se top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(arr[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
