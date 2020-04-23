package listaswitch;
import java.util.Scanner;
public class exercicio5 {
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um mês:");
		String A = entrada.next();
		switch (A) {
		case "dezembro":
		case "janeiro":
		case "fevereiro":
		case "junho":
		case "julho":
			System.out.println("Alta temporada!");
			break;
		case "marco":
		case "abril":
		case "maio":
		case "agosto":
		case "setembro":
		case "outubro":
		case "novembro":
			System.out.println("Baixa temporada!");
			break;
		default :
			System.out.println("mês inválido!");
			
		}
		
	}

}
