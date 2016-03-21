/**
 * 
 */
package exercicio5;

/**
 * @author sbonato
 * Imprime a progressão aritmética e geométrica
 */
public class Progressao {

	/**
	 * @param n número de termos
	 * @param r diferença entre termos
	 * Imprime os n termos de uma progressão aritmética de diferença r
	 */
	public void aritmetica(int n, int r){
		int termo = 1;
		System.out.println(termo);//sempre começa em 1
		for(int i = 1; i < n; i++){
			termo+=r;
			System.out.println(termo);
		}
	}
	
	/**
	 * @param n número de termos
	 * @param r razão entre termos
	 * Imprime os n termos de uma progressão geométrica de razão r
	 */
	public void geometrica(int n, int r){
		int termo = 1;
		System.out.println(termo);//sempre começa em 1
		for(int i = 1; i < n; i++){
			termo*=r;
			System.out.println(termo);
		}
	}
}
