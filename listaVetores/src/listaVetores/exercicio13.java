package listaVetores;

public class exercicio13 {
    static int[] geravetor(int []vetorA,int []vetorB){
        int []vetor = new int[vetorA.length+vetorB.length];
        for(int i=0;i<vetorA.length;i++){
            vetor[i]=vetorA[i];
        }
        for(int i=0;i<vetorB.length;i++){
            vetor[i+vetorA.length]=vetorB[i];
        }
        return vetor;
    }
    
    public static void main(String[] args) {
        int []vetorA = {64,31,53,69,46};
        int []vetorB = {34,71,13,95,16};
        int []vetorC = geravetor(vetorA,vetorB);
        for(int i=0;i<vetorC.length;i++){
            System.out.print(vetorC[i]+" ");
        }
    }
}