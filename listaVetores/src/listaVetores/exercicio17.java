package listaVetores;
import java.util.Scanner;
public class exercicio17 {
    static Scanner leitor = new Scanner(System.in);
    static double []encheVetor(double []vetor){
        for(int i=0;i<vetor.length;i++){
            System.out.println("Informe um número para preencher o vetor:");
            vetor[i] = leitor.nextDouble();
        }
        
        return vetor;
    }
    static double []multVetor(double []vetor,double num){
        for(int i=0;i<vetor.length;i++){
            vetor[i] = vetor[i]*num;
        }
        
        return vetor;
    }
    public static void main(String[] args) {
        double []vetor = new double[4];
        encheVetor(vetor);
        System.out.println("Informe um número real para multiplicar pelos números contidos no vetor:");
        double num = leitor.nextDouble();
        multVetor(vetor,num);
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
        System.out.println("");
    }
    
}