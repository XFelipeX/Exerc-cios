package listaVetores;

public class exercicio3 {
	public static void main(String[] args) {
		double []vetor = {23.04,13.13,50.49,9.99};
		double maior = 0;
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]>maior || i==0) {
				maior = vetor[i];
			}
		}
		System.out.println(maior+"");
	}
}
