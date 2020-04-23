package listaVetores;
import java.util.Scanner;
public class exercicio21 {
	static Scanner leitor = new Scanner(System.in);
	static int []preencheNota(int []vetor) {
		for(int i=0;i<vetor.length;i++) {
			System.out.println("Informe o nota dos alunos:");
			vetor[i]=leitor.nextInt();
		}
		return vetor;
	}
	static String []preencheNome(String []vetor){
		
		for(int i=0;i<vetor.length;i++) {
			System.out.println("Informe o nome dos alunos:");
			vetor[i]=leitor.next();
		}
		return vetor;
	}
	static int media(int []vetor) {
		int media=0,cont=0;
		for(int i=0;i<vetor.length;i++) {
			media = media+vetor[i];
			cont++;
		}
		media = media/cont;
		return media;
	}
	static String []calculaMedia(int []vetor,String []vetor2,int media) {
		int cont=0;
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]>media) {
				cont++;
			}			
		}
		String []acimaMedia = new String [cont];
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]>media) {
				acimaMedia[i] = vetor2[i];			
			}			
		}
		return acimaMedia;
	}
	public static void main (String[] args) {
		String []nome = new String[3];
		preencheNome(nome);
		int []nota = new int[3];
		preencheNota(nota);
		int media = media(nota);
		String []AcimaMedia = calculaMedia(nota,nome,media);
		System.out.println(media);
		System.out.println("Alunos que tiraram nota acima da média:");
		for(int i=0;i<AcimaMedia.length;i++) {
			System.out.println(AcimaMedia[i]);
		}
	}
	
}


