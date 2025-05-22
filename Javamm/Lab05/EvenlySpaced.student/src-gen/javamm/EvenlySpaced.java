package javamm;

@SuppressWarnings("all")
public class EvenlySpaced {
  public static boolean evenlySpaced(int a, int b, int c) {
    int minimo = EvenlySpaced.min(a, b, c);
    int medio = EvenlySpaced.mid(a, b, c);
    int massimo = EvenlySpaced.max(a, b, c);
    return ((medio - minimo) == (massimo - medio));
  }

  public static int min(int a, int b, int c) {
    return Math.min(a, Math.min(b, c));
  }

  public static int max(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
  }

  public static int mid(int a, int b, int c) {
    int minimo = EvenlySpaced.min(a, b, c);
    int massimo = EvenlySpaced.max(a, b, c);
    if (((a != minimo) && (a != massimo))) {
      return a;
    }
    if (((b != minimo) && (b != massimo))) {
      return b;
    }
    return c;
  }

  public static void main(String[] args) {
  }
}
