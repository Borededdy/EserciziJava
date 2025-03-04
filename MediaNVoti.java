/* Richiedi all'utente un numero intero n che rappresenta il
 * numero degli esami sostenuti da uno studente. 
 * Richiedi all'utente gli n voti dello studente e inseriscili 
 * in un array. 
 * Calcola e stampa a video la media dei voti 
 * inseriti nell'array.
 */

import java.util.Scanner;

public class MediaNVoti {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nvoti = 0;
		int[] voti;
		float avg = 0;

		System.out.println("Quanti voti si desidera inserire?: ");
		nvoti = sc.nextInt();
		voti = new int[nvoti];

		for (int i = 0; i <= (nvoti - 1); i++) {
			System.out.println("Inserisci voto " + (i + 1) + ": ");
			voti[i] = sc.nextInt();
		}

		for (int i = 0; i <= (nvoti - 1); i++) {
			avg += voti[i];
		}

		avg /= nvoti;

		System.out.println("Media Totale: " + avg);
	}
}
