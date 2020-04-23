import java.util.Arrays;

public class exercicio4 {
	public static int[] intercalacao(int []a,int []b) {
		int c[] = new int[a.length+b.length];
		int cont=0;
		for(int i=0;i<a.length;i++) {
			c[cont]=a[i];
			cont++;
		}
		for(int i=0;i<b.length;i++) {
			c[cont]=b[i];
			cont++;
		}
		Arrays.sort(c);
		return c;
	}

	public static void main(String[] args) {
		int []vetorA = { 1, 3, 6, 7};
		int []vetorB = { 2, 4, 5};
		int []vetorC = intercalacao(vetorA,vetorB);
		for(int i=0;i<vetorC.length;i++) {
			System.out.print(vetorC[i]+" ");
		}
	}

}
