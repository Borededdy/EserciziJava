package javamm;

@SuppressWarnings("all")
public class LoneSum {
  public static int loneSum(int a, int b, int c) {
    int sum = 0;
    if (((a != b) && (a != c))) {
      int _sum = sum;
      sum = (_sum + a);
    }
    if (((b != a) && (b != c))) {
      int _sum_1 = sum;
      sum = (_sum_1 + b);
    }
    if (((c != a) && (c != b))) {
      int _sum_2 = sum;
      sum = (_sum_2 + c);
    }
    return sum;
  }

  public static void main(String[] args) {
  }
}
