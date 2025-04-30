package project.service;

public class InsertionSort {

    public static void sort(int[] matrix) {
        System.out.println("\n---------- Imprimindo Matrix com Insertion Sort ---------");
        for (int i = 1; i < matrix.length; i++) {
            int key = matrix[i];
            int j = i - 1;
            while (j >= 0 && matrix[j] > key) {
                matrix[j + 1] = matrix[j];
                j--;
            }
            matrix[j + 1] = key;
        }
    }

}
