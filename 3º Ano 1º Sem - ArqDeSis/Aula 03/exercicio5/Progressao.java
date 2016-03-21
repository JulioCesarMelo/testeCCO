/**
 * 
 */
package exercicio5;

/**
 * @author sbonato
 * Imprime a progress�o aritm�tica e geom�trica
 */
public class Progressao {

	/**
	 * @param n n�mero de termos
	 * @param r diferen�a entre termos
	 * Imprime os n termos de uma progress�o aritm�tica de diferen�a r
	 */
	public void aritmetica(int n, int r){
		int termo = 1;
		System.out.println(termo);//sempre come�a em 1
		for(int i = 1; i < n; i++){
			termo+=r;
			System.out.println(termo);
		}
	}
	
	/**
	 * @param n n�mero de termos
	 * @param r raz�o entre termos
	 * Imprime os n termos de uma progress�o geom�trica de raz�o r
	 */
	public void geometrica(int n, int r){
		int termo = 1;
		System.out.println(termo);//sempre come�a em 1
		for(int i = 1; i < n; i++){
			termo*=r;
			System.out.println(termo);
		}
	}
}
