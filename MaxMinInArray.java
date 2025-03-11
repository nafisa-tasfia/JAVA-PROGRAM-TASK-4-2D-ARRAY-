
public class MaxMinInArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int max = arr[0][0];
        int min = arr[0][0];

        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) max = num;
                if (num < min) min = num;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

    

