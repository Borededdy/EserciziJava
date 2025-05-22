package javamm;

@SuppressWarnings("all")
public class IsSum {
  public static boolean isSum(int a, int b, int c) {
    if (((a + b) == c)) {
      return true;
    } else {
      if (((a + c) == b)) {
        return true;
      } else {
        if (((b + c) == a)) {
          return true;
        } else {
          return false;
        }
      }
    }
  }

  public static void main(String[] args) {
  }
}
