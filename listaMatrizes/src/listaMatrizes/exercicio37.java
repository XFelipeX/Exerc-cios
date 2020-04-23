package listaMatrizes;
//Dada uma matriz de tamanho N x M, de números inteiros, imprimir o número de linhas e o número de
//colunas nulas da matriz. Por exemplo, para a matriz abaixo, deve imprimir: Duas linhas nulas e uma coluna
//nula.

public class exercicio37 {
	static int qtdLinhas(int matriz[][]) {
		int linhasnulas=0,cont=0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(matriz[i][j]==0) {
					cont++;
				}
				if(cont==matriz.length) {
					linhasnulas++;
					cont=0;
				}
			}
		}
		return linhasnulas+1;
	}
	static int qtdColunas(int matriz[][]) {
		int linhasnulas=0,cont=0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(i<3) {
					if(matriz[j][i]==0) {
						cont++;
					}
				}
				if(cont==matriz.length) {
					linhasnulas++;
					cont=0;
				}
			}
		}
		return linhasnulas+1;
	}
	public static void main(String[] args) {
		int matriz[][] = {{0,0,0},{0,0,0},{0,0,0},{0,0,1}};
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		int linhas = qtdLinhas(matriz);
		int colunas = qtdColunas(matriz);
		System.out.println(linhas);
		System.out.println(colunas);
	}

}
