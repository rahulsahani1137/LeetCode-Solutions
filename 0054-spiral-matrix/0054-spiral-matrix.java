import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top Boundary
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            // Right Boundary
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            // Bottom Boundary
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    result.add(matrix[endRow][j]);
                }
            }

            // Left Boundary
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return result;
    }
}