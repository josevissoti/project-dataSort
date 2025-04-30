package project.service;

public class SelectionSort {

    public static void sort(int[] matrix) {
        System.out.println("\n---------- Imprimindo Matrix com Selection Sort ---------");
        int pos = 0;
        for (int i = 0; i < matrix.length; i++) {
            int valorMin = matrix[i];
            for (int j = i; j < matrix.length; j++) {
                if (matrix[j] < valorMin) {
                    valorMin = matrix[j];
                    pos = j;
                }
            }

            int valorTemp = matrix[i];
            matrix[i] = valorMin;
            matrix[pos] = valorTemp;
        }
    }

}
