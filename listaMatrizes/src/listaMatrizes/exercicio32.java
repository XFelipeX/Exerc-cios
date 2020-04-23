package listaMatrizes;
//Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a soma dos
//elementos das colunas ímpares da matriz.

public class exercicio32 {
	static int[] soma (int matriz[][]) {
		int vetor[] = new int[matriz.length-2];
		for(int i=0;i<matriz.length;i++) {
			int soma=0,aux=0;
			for(int j=0;j<matriz[i].length;j++) {
				if(i%2==1) {
					soma = soma+matriz[j][i];
	            }
			}
			if(vetor[aux]==0) {
			vetor[aux]=soma;
			soma=0;
			aux++;
			}
		}
		return vetor;
	}
	public static void main(String[] args) {
		int matriz[][] = {{0,1,2,3},{4,5,6,7},{8,9,10,11}};
		int vetor[] = soma(matriz);
		for(int i=0;i<vetor.length;i++) {
			System.out.println(vetor[i]+" ");
		}
	}

}
