public class ZigzagTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printZigzagTraversal(matrix);
    }

    public static void printZigzagTraversal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean direction = true; // true means left to right, false means right to left

        for (int i = 0; i < rows; i++) {
            if (direction) {
                // Traverse from left to right
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Traverse from right to left
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            direction = !direction; // Change the direction
        }
    }
}
