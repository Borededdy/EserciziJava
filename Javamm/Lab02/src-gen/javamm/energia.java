package javamm;

@SuppressWarnings("all")
public class energia {
  public static void main(String[] args) {
    int m = 5;
    float t0 = 15;
    float t1 = 45;
    double energia = 0;
    energia = ((4184 * m) * (t1 - t0));
    System.out.println(((((((("Energia necessaria per scaldare " + Integer.valueOf(m)) + " kili di acqua da una temperatura di ") + Float.valueOf(t0)) + "\u00B0 a ") + Float.valueOf(t1)) + "\u00B0 \u00E8 di: ") + Double.valueOf(energia)));
  }
}
