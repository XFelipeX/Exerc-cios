package listaVetores;

import java.util.Scanner;

public class exercicio7 {
	static double[] vetorMult(int []vetor,double valor) {
		double []vetorp=new double[vetor.length];
		for(int i=0;i<vetor.length;i++) {
			vetorp[i] = (vetor[i]*valor);
		}
		return vetorp;
	}
	static Scanner leitor = new Scanner(System.in);
	public static void main(String[] args) {
		int []vetor = {23};
		System.out.println("digite um valor real:");
		double valor = leitor.nextDouble();
		double []vetorf = vetorMult(vetor,valor);
		for(int i=0;i<vetorf.length;i++) {
			System.out.println(vetorf[i]+"");
		}
	}
}
