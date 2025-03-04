import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        /* Richiedi all'utente i voti di 4 esami. Quindi,
         * calcolare e stampare a video la media dei voti
         * inseriti. Non usare cicli.
         */
        Scanner sc = new Scanner(System.in);
        int voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0;
        float media;

        System.out.println("Specificare il Primo voto: ");
        voto1 = sc.nextInt();
        System.out.println("Specificare il Secondo voto: ");
        voto2 = sc.nextInt();
        System.out.println("Specificare il Terzo voto: ");
        voto3 = sc.nextInt();
        System.out.println("Specificare il Quarto voto: ");
        voto4 = sc.nextInt();

        media = (voto1 + voto2 + voto3 + voto4) / 4;

        System.out.println("Media: " + media);
    }
}
