package listaMatrizes;

import java.util.Scanner;

public class exercicio36 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[3];
        int[][] matriz = {{15, 2, 3}, {1, 32, 3}, {1, 2, 23}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    vetor[i] = matriz[i][j];
                }
            }
            System.out.printf("%d ",vetor[i]);
        }
    }
}

