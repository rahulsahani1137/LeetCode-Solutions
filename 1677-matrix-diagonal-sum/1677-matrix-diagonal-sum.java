class Solution {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int columns = mat[0].length;

        int sum = 0;
        for(int rowNo = 0; rowNo < rows; rowNo ++){
            int primaryDiagonal = mat[rowNo][rowNo];
            int secondaryDiagonal = mat[rowNo][columns - 1 - rowNo];
            sum += primaryDiagonal;

            //Condition to not add center element of matrix twice
            if(rowNo != (columns - 1 - rowNo)){
                sum += secondaryDiagonal;
            }
        }
        return sum;
    }
}