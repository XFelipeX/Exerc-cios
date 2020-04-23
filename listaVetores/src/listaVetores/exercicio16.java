package listaVetores;
import java.util.Scanner;
public class exercicio16 {
    static Scanner leitor = new Scanner(System.in);
    static int []preencheVetor (int []vetor){
    for(int i=0;i<vetor.length;i++){
        System.out.println("Informe um valor positivo:");
        vetor[i]=leitor.nextInt();
    }
    return vetor;
}
    
    static int []arrumaVetor(int []vetor){
        int []vetorP = new int[vetor.length];
        int cont=0;
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]%2==0){
                vetorP[cont]=vetor[i];
                cont++;
            }
        }
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]%2==1){
                vetorP[cont]=vetor[i];
                cont++;
            }
        }
        
        return vetorP;
    }
    public static void main(String[] args) {
        int []vetor = new int [8];
        preencheVetor(vetor);
        int []vetorP = arrumaVetor(vetor);
        for(int i=0;i<vetorP.length;i++){
            System.out.print(vetorP[i]+" ");
        }
    }
    
}