package listaVetores;

public class exercicio11 {
    static double media(double []vetor){
        double media=0,cont=0;
        for(int i=0;i<vetor.length;i++){
            if(i%2==0) {
        	cont++;
            media = media+vetor[i];
            }
        }
        media = media/cont;
        return media;
    }
    public static void main(String[] args) {
        double []vetor = {13,90,130,44,50};
        double mediaVetor = media(vetor);
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]>mediaVetor){
                System.out.println(vetor[i]+"");
            }
        }
    }
}