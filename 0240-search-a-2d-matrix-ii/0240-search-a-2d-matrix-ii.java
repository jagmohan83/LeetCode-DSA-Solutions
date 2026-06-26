class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row =0;
       int col = matrix[0].length-1;
      if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
      }
       
       while(row<matrix.length && col>=0){
        if(matrix[row][col]==target){
            return true;
        }else if(target<matrix[row][col]){
            col--;

        }else{
            row++;
        }
       } 
       return false;
    }
}