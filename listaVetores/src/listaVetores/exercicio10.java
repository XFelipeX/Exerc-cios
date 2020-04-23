package listaVetores;
import java.util.Scanner;
public class exercicio10 {
	static Scanner leitor = new Scanner(System.in);
	static double [] vetorFinal(double[]vetor, double valor) {
		for(int i=0;i<vetor.length;i++) {
			if (i%2==1) {
				vetor[i] = vetor[i]*valor;
			}
		}
		
		return vetor;
	}
	public static void main(String[] args) {
		System.out.println("Informe um valor:");
		double valor = leitor.nextDouble();
		double vetor[] = {12,42,24,14,11};
		double []vetorF = vetorFinal(vetor,valor);
		for(int i=0;i<vetorF.length;i++) {
			System.out.println(vetorF[i]+"");
		}
	}

}
