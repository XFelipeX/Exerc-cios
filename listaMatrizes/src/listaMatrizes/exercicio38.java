package listaMatrizes;

import java.util.Scanner;

public class exercicio38 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = {{3, 4, 3}, {1, 16, 3}, {1, 2, 14}};

        System.out.println("a parte superior da diagonal principal: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j) && (i < 2)) {
                    System.out.printf("%d ", matriz[i][j]);
                    System.out.println("");
                }
            }
        }
    }
}
