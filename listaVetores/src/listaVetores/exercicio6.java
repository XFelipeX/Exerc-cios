package listaVetores;

public class exercicio6 {
	public static void main(String[] args) {
		int []vetor = {23,13,50,9};
		int acumulador = 0;
		for(int i=0;i<vetor.length;i++) {
				if(i!=vetor.length-1) {
				acumulador = acumulador + (vetor[i]*vetor[i+1]);
				}
		}
		
		System.out.printf(""+acumulador);
	}
}
