package ado11;
import java.util.Scanner;
import java.util.Random;
public class caminho_minado {
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		Random dado = new Random();
		int n,m,indice,resposta;
		
		System.out.println("Digite o tamanho do caminho:"); //quantidade de posicoes no vetor
		n = leitor.nextInt(); 
		
		int tamanho[] = new int[n]; //criando vetor
		
		System.out.println("Digite a quantidade de bombas:"); //quantidade de bombas
		m = leitor.nextInt();
		int x = m;
		for(int h=0;h<tamanho.length;h++){ //adicionando valor "0" a todas as posicoes
			tamanho[h] =0;
		}
		
		if((n>0)&&((m>0)&&(m<n))){ //condição para inicar o jogo
			int pontos=0;
			int cont=0;
			boolean errou = true;
			do{ //adicionando as bombas
				indice = dado.nextInt(n); 
				if (tamanho[indice] == 0){
					tamanho[indice] = -1; 
				m--;
				}
			}while(m>0);
			do {
			//for(int s=0;s<tamanho.length;s++){
				//System.out.print(""+tamanho[s]+" ");
			//}
			for(int i=0;i<tamanho.length;i++){           //mascara para o usuário
				if((tamanho[i]==0)||(tamanho[i]==-1)){
				   	System.out.print("_ ");
				   	
				}
				else if(tamanho[i]==-2) {
					System.out.print("B");
					errou=false;
				}
				else if(tamanho[i]==1){
					System.out.print("X");
					if(pontos==n-x) {
						errou=false;
					}
				    
				}
				
				}
			if(errou==true){
		    System.out.println("\n");
			System.out.println("Digite uma posição:");
			resposta = leitor.nextInt();
			for(int p=0;p<tamanho.length;p++) {
				if (tamanho[p]==0 && resposta==p) {  //acertou uma posicao que nao tem bomba
					pontos = pontos+1;
					tamanho[p] = 1;
					if(pontos!=n-x) {
						if(p==0){
							if(tamanho[p+1]==-1){
								System.out.println("Cuidado: bomba próxima!");
							}
						}
						else if(p==tamanho.length-1){
							if(tamanho[p-1]==-1){
								System.out.println("Cuidado: bomba próxima!");
							}
						}
						else if(tamanho[p+1]==-1||tamanho[p-1]==-1){//verificando se tem bombas dos lados
							System.out.println("Cuidado: bomba próxima!");
						}
					}
				}
				if(tamanho[p]==-1 && resposta==p) { //acertou uma posição com bomba
						   	tamanho[p]=-2;
				}
			}
			}
			}while(errou==true);
			System.out.println("\n");
			if(pontos<n-x) {
				System.out.println("Game over!");
				System.out.println("PONTOS == "+pontos);
		}   else {
				System.out.println("Parabéns, você ganhou o jogo!");
				System.out.println("PONTOS == "+pontos);
		}
		}
			
		}
		
		
	}