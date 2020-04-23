
public class exercicio2 {
	public static String diferenca(int []a,int []b){
		String dif="";
		int aux=0;
		for(int i=0;i<a.length;i++) {
			int cont=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]!=b[j]) {
					 aux = a[i];
				}else {
					cont++;	
					}
				}
			if(cont==0) {
				dif+=" "+aux;	
			}
			}
		return dif;		
		}
		
	public static void main(String[] args) {
		int []vetorA = { 7, 2, 5, 8, 4};
		int []vetorB = { 4, 2, 9, 5};
		String diferenca = diferenca(vetorA,vetorB);
		System.out.println(diferenca);
	}

}
