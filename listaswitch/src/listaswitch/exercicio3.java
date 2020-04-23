package listaswitch;
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        int valor,nota100,nota50,nota10,nota5,nota1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quanto deseja retirar:");
        valor = entrada.nextInt();
        nota100 = valor/100;
        valor = valor%100;
        nota50 = valor/50;
        valor = valor%50;
        nota10 = valor/10;
        valor = valor%10;
        nota5 = valor/5;
        valor = valor%5;
        nota1 = valor/1;
       
        switch(nota100){
            case 1:
                System.out.println(nota100+" nota(s) de 100." ); 
                break;
            case 2:
                System.out.println(nota100+" nota(s) de 100." ); 
                break;
            case 3:                
                System.out.println(nota100+" nota(s) de 100." ); 
                break;
            case 4:                
                System.out.println(nota100+" nota(s) de 100." ); 
                break;
            case 5:                
                System.out.println(nota100+" nota(s) de 100." ); 
                break;          
        }
        switch(nota50){
            case 1:   
                System.out.println(nota50+" nota(s) de 50." ); 
                break;
            case 2:
                
                System.out.println(nota50+" nota(s) de 50." ); 
                break;
            
            
        }
        switch(nota10){
            case 1:
                
                System.out.println(nota10+" nota(s) de 10." ); 
                break;
            case 2:
                
                System.out.println(nota10+" nota(s) de 10." ); 
                break;
            
            
        }
        switch(nota5){
            case 1:
                
                System.out.println(nota5+" nota(s) de 5." ); 
                break;
            case 2:
                
                System.out.println(nota5+" nota(s) de 5." ); 
                break;
            
            
        }
        switch(nota1){
            case 1:
                
                System.out.println(nota1+" nota(s) de 1." ); 
                break;
            case 2:
                
                System.out.println(nota1+" nota(s) de 1." ); 
                break;
            
            
        }
        
    }
    
}