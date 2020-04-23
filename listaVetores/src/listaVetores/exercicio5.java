package listaVetores;

public class exercicio5 {
	public static void main(String[] args) {
		double []vetor = {23.04,13.13,50.49,9.99};
		double acumulador = 0;
		double cont=0;
		for(int i=0;i<vetor.length;i++) {
				cont++;
				acumulador = acumulador + vetor[i];
		}
		double media = acumulador/cont;
		System.out.printf(""+media);
	}
}
