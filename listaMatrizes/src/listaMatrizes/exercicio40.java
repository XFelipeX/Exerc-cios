package listaMatrizes;
import java.util.Scanner;
public class exercicio40 {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	        System.out.println("Digite um numero de 1 a 9: ");
	        int n = ler.nextInt();

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (n == matriz[i][j]) {
	                    System.out.println("a posição do némero está linha: " + (i + 1));
	                    System.out.println("na coluna: " + (j + 1));
	                }
	            }

	        }

	    }
	}

