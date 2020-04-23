package listaMatrizes;
//Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime
//cada elemento da matriz com o número 20.
import java.util.Scanner;
public class exercicio22 {
  public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      System.out.println("Digite a quantidade de linhas:");
      int linhas = leitor.nextInt();
      System.out.println("Digite a quantidade de colunas:");
      int colunas = leitor.nextInt();
      
      int matriz[][] = new int[linhas][colunas];
      for(int i=0;i<matriz.length;i++){
          for(int j=0;j<matriz[i].length;j++){
              matriz[i][j]=20;
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