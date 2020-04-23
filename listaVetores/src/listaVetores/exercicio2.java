package listaVetores;
public class exercicio2 {
	public static void main(String[] args) {
		double []vetor = {23.04,13.13,50.49,9.99};
		double acumulador = 0;
		for(int i=0;i<vetor.length;i++) {
			acumulador = acumulador+vetor[i];
		}
		System.out.println(acumulador+"");
	}
}
