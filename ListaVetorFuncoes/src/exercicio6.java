// Escreva uma função que recebe um vetor como parâmetro, a sua função seleciona o
//primeiro elemento de um vetor e rearranja o vetor de forma que todos elementos
//menores ou iguais ao primeiro elemento fiquem a sua esquerda e os maiores a sua
//direita.
public class exercicio6 {
	public static void arrumaVetor(int []v) {
		int aux;
		int cont=0;
		for(int i=0;i<v.length;i++) {
			if(i>0 && v[i]<=v[0]) {
				v[cont]=v[i];
				cont++;
			}else if(i>0) {
				aux=v[i];
				
			}
			
		}
	}
	public static void main(String[] args) {
		int []vetor = {3,9,7,2,4,10,5,15,6};
		arrumaVetor(vetor);
		for(int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i]+" ");
		}
	}
}
