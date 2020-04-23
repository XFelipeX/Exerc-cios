package listaswitch;
import java.util.Scanner;
public class exercicio8 {
	public static void main(String[] args) {
		float anuidade,juros;
		String mes;
		juros = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o valor da anuidade:");
		anuidade = entrada.nextFloat();
		System.out.print("informe o mês:");
		mes = entrada.next();
		juros =(anuidade*5)/100;
		int mes2 = Integer.parseInt(mes);
		switch(mes2) {
		case 1:
			System.out.println("Obrigado por pagar em dia!");
			break;
		case 2:
			System.out.print("Você pagará uma multa de == "+juros);
			break;
		case 3:
			juros = (juros*2)+(5*5)/100;
			System.out.print("Você pagará uma multa de == "+juros);
			break;
		case 4:
			juros = juros*3;
			System.out.print("Você pagará uma multa de == "+juros);
			break;
		case 5:
			juros = juros*4;
			System.out.print("Você pagará uma multa de == "+juros);
			break;
		case 6:
			juros = juros*5;
			System.out.print("Você pagará uma multa de == "+juros);
			break;
		case 7:
			juros = juros*6;
			System.out.print("Você pagará uma multa de == "+juros);
			break;
		case 8:
			juros = juros*7;
			System.out.print("Você pagará uma multa de == "+juros);
			break;
		case 9:
			juros = juros*8;
			System.out.print("Você pagará uma multa de == "+juros);
			break;
		case 10:
			juros = juros*9;
			System.out.print("Você pagará uma multa de == "+juros);
			break;
		case 11:
			juros = juros*10;
			System.out.print("Você pagará uma multa de == "+juros);
			break;
		case 12:
			juros = juros*11;
			System.out.print("Você pagará uma multa de == "+juros);
			break;
		}
		
		
		
		
	}

}
