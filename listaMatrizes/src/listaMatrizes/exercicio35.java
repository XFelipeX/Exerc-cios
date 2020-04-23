package listaMatrizes;
import java.util.Scanner;
public class exercicio35 {

	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        int[][] matriz = {{4, -2, 3}, {4, 2, -3}, {-1, 2, 3}};

	        int soma = 0;
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (matriz[i][j] > 0) {
	                    soma = soma + matriz[i][j];
	                }
	            }
	        }
	        double media = 0;
	        int QtosPos = 0;
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (matriz[i][j] > 0) {
	                    QtosPos++;
	                    media = (double) soma / QtosPos;                   
	                }
	            }
	        }
	        System.out.println("soma: "+soma);
	        System.out.println("qtospos: "+QtosPos);
	        System.out.println("a media é:" + media);
	    }
	}


