
public class exercicio1 {
	public static String interseccao(int []a,int []b) {
		String uniao="";
		int aux=0;
		for(int i=0;i<a.length;i++) {
			int cont=0;
			for(int j=0;j<b.length;j++) {
				if(a[i] == b[j]) {
					aux=a[i];
				}else if(cont==0) {
					if(aux!=0) {
						uniao+=" "+aux;
					}
					cont++;
				}
			}
		}
		
		return uniao;
	}
	public static void main(String[] args) {
		int []vetorA = { 7, 2, 5, 8, 4};
		int []vetorB = { 4, 2, 9, 5};
		String uniao = interseccao(vetorA, vetorB);
		System.out.println(uniao);
	}
}
