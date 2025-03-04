/* Richiedi all'utente i voti di 4 esami. Inserisci in
 * un array e calcola e stampa a video la media dei voti 
 * inseriti 
 */
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Voti = new int[4];
		float avg = 0;

		for(int i = 0; i <= 3; i++){
			System.out.println("Inserisci Voto " + (i + 1) + ": ");
			Voti[i] = sc.nextInt();
		}

		for(int i = 0; i <= 3; i++){
			avg += Voti[i];
		}

		avg /= 4;

		System.out.println("Media Voti: " + avg);
	}
}
