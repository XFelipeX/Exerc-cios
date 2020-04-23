package listaMatrizes;
import java.util.Scanner;
public class exercicio39 {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        int[][] matriz1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
	        int[][] matriz2 = {{4, 5, 6}, {4, 5, 6}, {4, 5, 6}};
	        int[][] matriz3 = new int[3][3];

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                matriz3[i][j] = matriz1[i][j] * matriz2[i][j];
	                System.out.printf("%d ", matriz3[i][j]);
	            }
	            System.out.println("");
	        }
	    }
	}

