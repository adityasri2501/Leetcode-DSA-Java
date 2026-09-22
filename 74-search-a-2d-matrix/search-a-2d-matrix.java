class Solution {
    public boolean searchMatrix(int[][] mat, int target) {

        // if(mat.length == 1 && mat[0].length == 1){
        //     return (mat[0][0] == target) ? true : false;
        // }

        int low = 0, high = mat.length - 1, mid = 0, row = -1;

        while(low<= high){
            mid = Math.floorDiv(low+high, 2);
            if(mat[mid][0] == target || mat[mid][mat[mid].length - 1] == target){
                return true;
            }else if (mat[mid][0] < target && target < mat[mid][mat[mid].length - 1]){
                row = mid;
                break;
            } else if(mat[mid][0] < target){
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }

        // System.out.println("row = " + row);

        if(row == -1){
            return false;
        }

        low = 0;
        high = mat[mid].length - 1;

        while(low <= high){
            mid = Math.floorDiv(low+high, 2);

            if(mat[row][mid] == target){
                return true;
            } else if(mat[row][mid] > target){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }

        return false;

    }
}