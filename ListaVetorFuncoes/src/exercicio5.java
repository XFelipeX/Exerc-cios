//Dado um vetor com números pares e ímpares, escreva uma função para colocar todos
//os números pares à frente no vetor e os ímpares ao final. Você não pode usar outro
//vetor como área auxiliar. 
public class exercicio5 {
	public static void arrumaVetor(int []v) {
		int aux;
		int cont=0;
		for(int i=0;i<v.length;i++) {
			if(v[i]%2==0) {
				aux=v[i];
				v[i]=v[cont];
				v[cont]=aux;
				cont++;
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
