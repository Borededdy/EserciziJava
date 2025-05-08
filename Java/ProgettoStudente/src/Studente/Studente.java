package Studente;
import java.util.ArrayList;
import java.util.Scanner;

public class Studente {
    private String nome;
    private String cognome;
    private int eta;
    private int matricola;
    ArrayList<Esame> Esami;
    Scanner sc = new Scanner(System.in);

    public Studente(String nome, String cognome, int eta, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.matricola = matricola;
        this.Esami = new ArrayList<Esame>();
    }

    public void AddEsame(String nome_corso, int voto, int cfu) {
        Esami.add(new Esame(nome_corso, voto, cfu));
    }

    public void getData(){
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Eta: " + eta);
        System.out.println("Matricola: " + matricola);
        for(Esame e : Esami) {
            System.out.println(e);
        }
    }

    public void getMediaPond(){
        float media = 0;
        int sumvoti = 0;
        int sumcfu = 0;
        for(Esame e : Esami) {
            sumvoti += e.getVoto();
            sumcfu += e.getCfu();
        }
        media = sumvoti/sumcfu;
        System.out.println("Media: " + media);
    }
}
