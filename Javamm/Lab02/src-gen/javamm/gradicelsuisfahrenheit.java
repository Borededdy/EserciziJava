package javamm;

@SuppressWarnings("all")
public class gradicelsuisfahrenheit {
  public static void main(String[] args) {
    float c = 35;
    float f = 0;
    f = (((9 / 5) * c) + 32);
    System.out.println(((("Temperatura in Celsius: " + Float.valueOf(c)) + " Temperatura in Fahrenheit: ") + Float.valueOf(f)));
  }
}
