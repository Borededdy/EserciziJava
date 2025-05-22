package javamm;

@SuppressWarnings("all")
public class RoundSum {
  public static int roundSum(int a, int b, int c) {
    int _round = RoundSum.round(a);
    int _round_1 = RoundSum.round(b);
    int _plus = (_round + _round_1);
    int _round_2 = RoundSum.round(c);
    return (_plus + _round_2);
  }

  public static int round(int a) {
    int lastDigit = (a % 10);
    if ((lastDigit < 5)) {
      return (a - lastDigit);
    } else {
      return (a + (10 - lastDigit));
    }
  }

  public static void main(String[] args) {
  }
}
