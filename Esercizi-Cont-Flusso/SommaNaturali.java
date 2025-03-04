import java.util.Random;

public class SommaNaturali {
	/*
	 * Dato il seguente metodo sommaNaturali, che restiruisce la 
	 * somma dei primi n numeri naturali magigori di 0. 
	 */

	static int sommaNaturali(int n){
		int somma = 0;
		for (int i=1; i<=n; i++){
			somma = somma + i;
		}
		return somma;
	}

	/*
	 * Definire un metodo RICORSIVO che effettua lo stesso calcolo. 
	 * 
	 */

	static int sommaNaturaliRic(int n){
		if (n == 0) {  // Caso base: la somma dei primi 0 numeri è 0
			return 0;
		}
		return n + sommaNaturaliRic(n - 1);
	}
	
	
	public static void main(String[] args) {
		Random gen = new Random();
		int n = gen.nextInt(10);
		System.out.print("Esercizio corretto: "+(sommaNaturali(n)==sommaNaturaliRic(n)));
	}
}
