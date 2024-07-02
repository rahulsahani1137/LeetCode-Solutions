class Solution {
    public int diagonalSum(int[][] mat) {
        //Time Complexity O(n)
        int sum = 0;
        
        for(int i = 0; i < mat.length; i++) {
            //Primary diagonal
            sum += mat[i][i];

            //Secondary diagonal
            if(i != mat.length-1-i){
                sum += mat[i][mat.length-1-i];
            }
        }
        return sum;
    }
}