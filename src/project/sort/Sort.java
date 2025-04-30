package project.sort;

import project.service.BubbleSort;
import project.service.InsertionSort;
import project.service.SelectionSort;
import project.service.SortService;

import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da matrix a ser gerada: ");
        int tamanho = scanner.nextInt();

        long inicio = System.currentTimeMillis();

        System.out.println("---------- Imprimindo Matrix ----------");
        int[] matrix = SortService.gerarMatrix(tamanho);
        SortService.imprimirMatrix(matrix);
        InsertionSort.sort(matrix);
        SortService.imprimirMatrix(matrix);

        long fim = System.currentTimeMillis();
        System.out.println("\nTempo para ordenação dos dados: " + (fim - inicio) + " milisegundos");

    }
}
