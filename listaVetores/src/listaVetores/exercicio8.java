package listaVetores;

import java.util.Scanner;

public class exercicio8 {
	static Scanner leitor = new Scanner(System.in);
	public static void main(String[] args) {
		int []vetor = {23};
		System.out.println("digite um valor:");
		int valor = leitor.nextInt();
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]==valor) {
				System.out.println("O valor informado está contido no vetor.");
			}else {
				System.out.println("O valor informado não está contido no vetor.");
			}
		}
	}
}
