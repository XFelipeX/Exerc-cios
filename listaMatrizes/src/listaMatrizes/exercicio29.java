package listaMatrizes;
//Dada uma matriz de tamanho N x M e um vetor de M elementos, fazer um programa que preencha cada
//linha da matriz com os elementos do vetor..
public class exercicio29 {
	static int [][] preencheMatriz(int [][]matriz,int vetor[]){
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j] = vetor[j];
			}
		}
		
		return matriz;
	}
	public static void main(String[] args) {
		int matriz[][] = new int[3][4];
		int vetor[] = {0,1,2,3};
		preencheMatriz(matriz,vetor);
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+"");
			}
			System.out.println();
		}
	}

}
