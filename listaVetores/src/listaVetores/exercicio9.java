package listaVetores;

public class exercicio9 {
	static int[] vetorC(int[]vetorA,int[] vetorB) {
		int []vetorC = new int[vetorA.length];
		for(int i=0;i<vetorC.length;i++) {
			vetorC[i]= vetorA[i]*vetorB[i];
		}
		return vetorC;
	}
	
	public static void main(String[] args) {
		int []vetor1 = {12,41,85,32};
		int []vetor2 = {11,51,55,72};
		int []vetor3 = vetorC(vetor1,vetor2);
		for(int i=0;i<vetor3.length;i++) {
			System.out.println(vetor3[i]+"");
		}
	}

}
