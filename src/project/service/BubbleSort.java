package project.service;

public class BubbleSort {

    public static int[] sort(int[] matrix) {
        System.out.println("\n---------- Imprimindo Matrix com Bubble Sort ---------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                if (matrix[j] < matrix[i]) {
                    int valorTemp = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = valorTemp;
                }
            }
        }

        return matrix;
    }

}
