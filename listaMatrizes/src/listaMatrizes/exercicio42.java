package listaMatrizes;
import java.util.Scanner;
public class exercicio42 {
	static Scanner leitor = new Scanner(System.in);
	static int maiorN(int matriz[][]) {
		int maior=0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if((matriz[i][j]>maior)) {
					maior=matriz[i][j];
				}
			}
		}
		
		return maior;
	}
	static int [][] populaMatriz(int [][]matriz){
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.println("Informe um número:");
				matriz[i][j] = leitor.nextInt();
			}
		}
		return matriz;
	}
	public static void main(String[] args) {
		int [][]matrizA = new int [3][3];
		int [][]matrizB = new int [3][3];
		System.out.println("Preencha a matriz A:");
		populaMatriz(matrizA);
		System.out.println("Preencha a matriz B:");
		populaMatriz(matrizB);
		int maiorA = maiorN(matrizA);
		int maiorB = maiorN(matrizB);
		int produto = maiorA*maiorB;
		
		System.out.println(produto);
	}
}
