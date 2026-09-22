class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int row = 0, column = mat[0].length - 1;

        while(row < mat.length && column >= 0){
            if(mat[row][column] == target){
                return true;
            } else if(target < mat[row][column]){
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}