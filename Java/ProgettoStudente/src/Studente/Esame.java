package Studente;

public class Esame {
    private String nome_corso;
    private int voto;
    private int cfu;

    public Esame(String nome_corso, int voto, int cfu) {
        this.nome_corso = nome_corso;
        this.voto = voto;
        this.cfu = cfu;
    }

    public int getVoto() {
        return voto;
    }

    public int getCfu() {
        return cfu;
    }

    @Override
    public String toString() {
        return "Esame: " + nome_corso + ", voto: " + voto + ", cfu: " + cfu;
    }
}
