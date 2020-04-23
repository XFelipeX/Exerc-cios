package listaMatrizes;

import java.util.Scanner;

public class exercicio34 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] matriz = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma = soma + matriz[i][j];
            }
        }
        System.out.println("a soma de todos os elementos da matriz é: " + soma);
    }
}

