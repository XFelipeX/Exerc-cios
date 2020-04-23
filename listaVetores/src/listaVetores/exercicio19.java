package listaVetores;

public class exercicio19 {
	public static void main(String[] args) {
		int []vetor = {1,2,3,4,5,6,7,8};
		for(int i=0;i<vetor.length;i++) {
			if((i%2==1)) {
				System.out.print(vetor[i]+" ");
			}
		}
	}
}
