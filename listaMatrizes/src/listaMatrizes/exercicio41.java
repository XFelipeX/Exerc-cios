package listaMatrizes;

public class exercicio41 {
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
	public static void main(String[] args) {
		int [][]matriz = {{0,1,2,3,4,5},{6,7,8,9,10,11}};
		int maior = maiorN(matriz);
		
		System.out.println(maior);
	}

}
