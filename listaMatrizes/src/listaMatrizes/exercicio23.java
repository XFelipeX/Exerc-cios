package listaMatrizes;
//Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime
//cada elemento da matriz com o número 21, se a linha for ímpar, e com 10 se a linha for par.
import java.util.Scanner;
public class exercicio23 {
  public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      System.out.println("Digite a quantidade de linhas:");
      int linhas = leitor.nextInt();
      System.out.println("Digite a quantidade de colunas:");
      int colunas = leitor.nextInt();
      
      int matriz[][] = new int[linhas][colunas];
      for(int i=0;i<matriz.length;i++){
          for(int j=0;j<matriz[i].length;j++){
              if(i%2==1){
                  matriz[i][j]=21;
              }else{
                  matriz[i][j]=10;
              }
          }
      }
      for(int i=0;i<matriz.length;i++){
          for(int j=0;j<matriz[i].length;j++){
              System.out.print(matriz[i][j]+"");
          }
          System.out.println();
      }
  }
}