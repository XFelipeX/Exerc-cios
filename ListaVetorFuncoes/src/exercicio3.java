
public class exercicio3 {
	public static String uniao(int []a,int []b) {
		String uniao = "";
		int aux=0;
		for(int i=0;i<a.length;i++) {
			uniao+=a[i];
		}
		for(int i=0;i<b.length;i++) {
			int cont=0;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					cont++;
				}else if(cont==0) {
					aux=b[i];
				}	
			}
			if(cont==0) {
				uniao+=aux;
			}
		}
		return uniao;
	}
	public static void main(String[] args) {
		int []vetorA = { 7, 2, 5, 8, 4};
		int []vetorB = { 4, 2, 9, 5};
		String uniao = uniao(vetorA,vetorB);
		System.out.println(uniao);
	}
}
