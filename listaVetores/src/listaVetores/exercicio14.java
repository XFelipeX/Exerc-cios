package listaVetores;
public class exercicio14 {
    static int[]geraVetor(int []vetorA,int []vetorB){
    int []vetor = new int[vetorA.length+vetorB.length];
    int cont=0;
    for(int i=0;i<vetor.length;i++){
        if(i%2==0){
            vetor[i]=vetorA[cont];
            cont++;
        }
    }
    cont=0;
    for(int i=0;i<vetor.length;i++){
        if(i%2==1){
            vetor[i]=vetorB[cont];
            cont++;
        }
    }
    return vetor;
}
    public static void main(String[] args) {
        int []vetorA = {10,20,30,40,50};
        int []vetorB = {15,32,70,90,80};
        int []vetorC = geraVetor(vetorA,vetorB);
        for(int i=0;i<vetorC.length;i++){
            System.out.print(vetorC[i]+" ");
        }
    }
    
}