package listaVetores;
// Fazer um programa que verifica se determinado número dado está dentro de um vetor também dado.
//Caso esteja, imprimir a posição em que o número foi encontrado.
import java.util.Scanner;
public class exercicio18 {
	static Scanner leitor = new Scanner(System.in);
	static int []encheVetor(int []vetor){
		for(int i=0;i<vetor.length;i++) {
			System.out.println("Informe um numero para preencher o vetor:");
			vetor[i] = leitor.nextInt();
		}
		
		return vetor;
	}
	public static void main(String[] args) {
		int x=0,cont=0;
		int []vetor = new int[4];
		encheVetor(vetor);
		System.out.println("Informe um número para verificar:");
		int num = leitor.nextInt();
		for(int i=0;i<vetor.length;i++) {
			if(num==vetor[i]) {
				 x=i+1;
				 cont=1;
			}
		}
		if(cont==1) {
			System.out.println("A posicão em que o número foi encontrado ==>"+x);
		}else {
			System.out.println("Número não encontrado!");
		}
		
	}
}
