package listaMatrizes;
//Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a soma dos
//elementos de cada linha da matriz.

public class exercicio28 {
		public static void main(String[] args) {
			int [][]matriz = {{0,1,3},{4,8,5},{3,2,6}};
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++) {
					System.out.print(matriz[i][j]+" ");
				}
				System.out.println();
			}
			int somaA=0,somaB=0,somaC=0;
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++) {
					if(i==0) {
						somaA=somaA+matriz[i][j];
					}
					else if(i==1) {
						somaB=somaB+matriz[i][j];
					}
					else if(i==2) {
						somaC=somaC+matriz[i][j];
					}
				}
	
			}
			System.out.println();
			System.out.println(somaA+" \n"
					+somaB+"\n"
					+somaC+"\n");
			
		}

	}
