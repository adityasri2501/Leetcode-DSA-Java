public class spiralMatrix {
    public static void main(String[] args) {

        /*
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

        */
        int arr[][] = {
            {4,17,18,19,21},
            {18,17,12,1,41},
            {14,13,17,9,17}
            };

        int n = arr.length;
        int m = arr[0].length;

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        int max_iter = n*m, iter_done = 1, i = top, j = left - 1;

        while(iter_done <= max_iter){
            if(i == top && j < right){
                j++;
                System.out.println(arr[i][j]);
                iter_done++;
            }else if(j == right && i < bottom){
                i++;
                System.out.println(arr[i][j]);
                iter_done++;
            }else if (i == bottom && j > left){
                j--;
                System.out.println(arr[i][j]);
                iter_done++;
            } else if(j == left && i > top + 1){
                i--;
                System.out.println(arr[i][j]);
                iter_done++;
            } else{
                left++;
                right--;
                top++;
                bottom--;
            }
        }
    }
}
