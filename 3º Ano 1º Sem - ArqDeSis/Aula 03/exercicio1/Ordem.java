/**
 * 
 */
package exercicio1;

/**
 * @author sbonato
 * Ordena numeros
 */
public class Ordem {

	/**
	 * @param a inteiro a ser ordenado
	 * @param b inteiro a ser ordenado
	 * @param c inteiro a ser ordenado
	 * Ordena usando uma ordenacao por bolha, trocando 3 vezes os maiores
	 * pelos menores
	 */
	public String crescente(int a, int b, int c) {
		int aux;
		if(a > b){
			aux = b;
			b = a;
			a = aux;
		}
		if(a > c){
			aux = c;
			c = a;
			a = aux;
		}
		if(b > c){
			aux = c;
			c = b;
			b = aux;
		}
		return String.format("%d %d %d", a, b, c);
	}
}
