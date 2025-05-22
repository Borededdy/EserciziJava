package javamm;

@SuppressWarnings("all")
public class Order {
  public static boolean order(int a, int b, int c, boolean noA) {
    if ((((!noA) && (a < b)) && (b < c))) {
      return true;
    } else {
      if ((noA && (b < c))) {
        return true;
      } else {
        return false;
      }
    }
  }

  public static void main(String[] args) {
  }
}
