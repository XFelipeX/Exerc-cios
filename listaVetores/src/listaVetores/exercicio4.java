package listaVetores;

public class exercicio4 {
	public static void main(String[] args) {
		double []vetor = {23.04,13.13,50.49,9.99};
		double menor = 0;
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]<menor || i==0) {
				menor = vetor[i];
			}
		}
		System.out.println(menor+"");
	}
}
