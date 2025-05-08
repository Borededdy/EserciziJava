package Studente;
import javax.accessibility.AccessibleKeyBinding;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        String cognome;
        int eta;
        int matricola;
        int nesami = 0;
        boolean check = false;

        System.out.println("Inserisci nome studente: ");
        nome = new Scanner(System.in).nextLine();
        System.out.println("Inserisci cognome studente: ");
        cognome = new Scanner(System.in).nextLine();
        System.out.println("Inserisci eta studente: ");
        eta = new Scanner(System.in).nextInt();
        System.out.println("Inserisci matricola studente: ");
        matricola = new Scanner(System.in).nextInt();

        Studente studente1 = new Studente(nome, cognome, eta, matricola);

        while(!check){
            System.out.println("Quanti esami si vuole inserire?: ");
            nesami = new Scanner(System.in).nextInt();
            if (nesami == 0) {
                throw new IllegalStateException("Non si possono caricare 0 esami.");
            } else if (nesami > 30) {
                throw new IllegalStateException("Non si possono caricare più di 30 esami.");
            } else check = true;
        }

        for(int i = 0; i <= nesami - 1; i++){
            String nome_corso;
            int voto;
            int cfu;

            System.out.println("Inserisci nome corso: ");
            nome_corso = new Scanner(System.in).nextLine();
            System.out.println("Inserisci voto esame: ");
            voto = new Scanner(System.in).nextInt();
            System.out.println("Inserisci cfu esame: ");
            cfu = new Scanner(System.in).nextInt();
            studente1.AddEsame(nome_corso, voto, cfu);
        }

        studente1.getData();
        studente1.getMediaPond();
    }
}
