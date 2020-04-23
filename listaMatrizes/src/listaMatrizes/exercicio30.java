package listaMatrizes;
//Dada uma matriz de tamanho N x M e um vetor de N elementos, fazer um programa que preencha cada
//coluna da matriz com os elementos do vetor.
public class exercicio30 {
	static int [][] preencheMatriz(int [][]matriz,int vetor[]){
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(j<3) {
					matriz[j][i] = vetor[j];
				}else if(j==3) {
						switch(i) {
						case 0:
							matriz[i][j] = vetor[j-3];
							break;
						case 1:
							matriz[i][j] = vetor[j-2];
							break;
						case 2:
							matriz[i][j] = vetor[j-1];
							break;
						}
					
				}
			}
			}
		return matriz;
		}
	public static void main(String[] args) {
		int matriz[][] = new int[3][4];
		int vetor[] = {0,1,2};
		preencheMatriz(matriz,vetor);
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+"");
			}
			System.out.println();
		}
	}

}
