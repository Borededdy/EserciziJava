package javamm;

@SuppressWarnings("all")
public class Range {
  public static boolean range(int n, int l, int r, boolean o) {
    return ((((n < l) || (n > r)) && o) || (((n >= l) && (n <= r)) && (!o)));
  }

  public static void main(String[] args) {
  }
}
