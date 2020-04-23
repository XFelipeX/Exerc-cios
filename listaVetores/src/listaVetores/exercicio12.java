package listaVetores;

public class exercicio12 {
	static int somaVetor(int []vetor) {
		int soma=0;
		for(int i=0;i<vetor.length;i++) {
			soma = soma+vetor[i];
		}
		
		return soma;
	
	}
	static int mediaVetor(int []vetor) {
		int media=0,cont=0;
		for(int i=0;i<vetor.length;i++) {
			cont++;
			media = media+vetor[i];
		}
		media = media/cont;
		return media;
		
	}
	public static void main(String[] args) {
		int vetor1[] = {10,50,30,90};
		int vetor2[] = {41,87,28,9};
		int somaVetor1 = somaVetor(vetor1);
		int somaVetor2 = somaVetor(vetor2);
		int mediaVetor1 = mediaVetor(vetor1);
		int mediaVetor2 = mediaVetor(vetor2);
		if(somaVetor1>somaVetor2) {
			System.out.println("maior soma == "+somaVetor1);
		}else {
			System.out.println("maior soma == "+somaVetor2);
		}
		if (mediaVetor1<mediaVetor2) {
			System.out.println("menor média == "+mediaVetor1);
		}else {
			System.out.println("menor média == "+mediaVetor2);
		}
	}
}
