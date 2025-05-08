package javamm;

@SuppressWarnings("all")
public class cifrediunnumero {
  public static void main(String[] args) {
    int numero = 320;
    int somma = 0;
    if ((numero > 999)) {
      System.out.println("Inserire un numero di MAX 3 cifre");
      return;
    }
    while ((numero > 0)) {
      {
        int _somma = somma;
        somma = (_somma + (numero % 10));
        int _numero = numero;
        numero = (_numero / 10);
      }
    }
    System.out.println(("Somma delle cifre del numero: " + Integer.valueOf(somma)));
  }
}
