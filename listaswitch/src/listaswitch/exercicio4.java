package listaswitch;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
		int mes,ano,dias;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o mês:");
		mes = entrada.nextInt();
		System.out.print("Informe o ano:");
		ano = entrada.nextInt();
		switch(mes) {
		case 1:
			System.out.print("Mês janeiro do ano de "+ano+" tem 31 dias.");
			break;
		case 2:
			System.out.print("Mês fevereiro do ano de "+ano+" tem 28 dias.");
			break;
		case 3:
			System.out.print("Mês Março do ano de "+ano+" tem 31 dias.");
			break;
		case 4:
			System.out.print("Mês Abril do ano de "+ano+" tem 30 dias.");
			break;
		case 5:
			System.out.print("Mês maio do ano de "+ano+" tem 31 dias.");
			break;
		case 6:
			System.out.print("Mês junho do ano de "+ano+" tem 30 dias.");
			break;
		case 7:
			System.out.print("Mês julho do ano de "+ano+" tem 31 dias.");
			break;
		case 8:
			System.out.print("Mês agosto do ano de "+ano+" tem 31 dias.");
			break;
		case 9:
			System.out.print("Mês setembro do ano de "+ano+" tem 30 dias.");
			break;
		case 10:
			System.out.print("Mês outubro do ano de "+ano+" tem 31 dias.");
			break;
		case 11:
			System.out.print("Mês novembro do ano de "+ano+" tem 30 dias.");
			break;
		case 12:
			System.out.print("Mês dezembro do ano de "+ano+" tem 31 dias.");
			break;
		}
		
	}
}
