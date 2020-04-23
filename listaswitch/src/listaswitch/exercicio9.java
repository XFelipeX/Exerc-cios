package listaswitch;
import java.util.Scanner;
public class exercicio9 {
	public static void main (String[] args){
		char d1,d2,d3,d4,d5,d6,d7,d8,d9;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu cpf:");
		String CPF = entrada.next();
		d1 = CPF.charAt(0);
		d2 = CPF.charAt(1);
		d3 = CPF.charAt(2);
		d4 = CPF.charAt(3);
		d5 = CPF.charAt(4);
		d6 = CPF.charAt(5);
		d7 = CPF.charAt(6);
		d8 = CPF.charAt(7);
		d9 = CPF.charAt(8);
		int dd1 =d1*10;
		int dd2 =d2*9;
		int dd3 =d3*8;
		int dd4 =d4*7;
		int dd5 =d5*6;
		int dd6 =d6*5;
		int dd7 =d7*4;
		int dd8 =d8*3;
		int dd9 =d9*2;
		
		int soma = dd1+dd2+dd3+dd4+dd5+dd6+dd7+dd8+dd9;
		int resto = soma%11;
		int sub = resto-11;
		
	
	

	}
}
