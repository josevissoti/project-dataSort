package project.service;

import java.util.Random;

public class SortService {

    public static void imprimirMatrix(int[] matrix) {
        for (int numero : matrix) {
            System.out.print(numero + " ");
        }
    }

    public static int[] gerarMatrix(int tamanho) {
        Random random = new Random();
        int[] matrix = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            matrix[i] = random.nextInt(1000);
        }

        return matrix;
    }

}
