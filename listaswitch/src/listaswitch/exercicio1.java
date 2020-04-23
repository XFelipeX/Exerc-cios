package listaswitch;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        int N,divisivel;    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        N = entrada.nextInt();
        divisivel = N%3;
        
        switch (divisivel){
            case 0:
                System.out.println("O número "+N+" é divisivel por 3.");
                break;
            default:
                System.out.println("O número "+N+" não é divisivel por 3.");
        
        }
    }
}
    
