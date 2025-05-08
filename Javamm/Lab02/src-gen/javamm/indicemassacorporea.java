package javamm;

@SuppressWarnings("all")
public class indicemassacorporea {
  public static void main(String[] args) {
    int peso = 82;
    double altezza = 1.75;
    double indice = 0;
    double _pow = Math.pow(altezza, 2);
    double _divide = (peso / _pow);
    indice = _divide;
    System.out.println(("Indice di massa corporea: " + Double.valueOf(indice)));
  }
}
