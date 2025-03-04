import java.util.Scanner;
public class Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vote = 0, CFU = 0, CFUtot = 0, i = 0;
        float avg = 0;

        do {
            System.out.println("Inserire il Voto " + (i + 1) + ", seguito dal valore in CFU: ");
            vote = sc.nextInt();
            CFU = sc.nextInt();
            avg += vote * CFU;
            CFUtot += CFU;
            i++;
        } while(i <= 3);

        avg /= CFUtot;

        System.out.println("La Media Ponderata è: " + Math.round(avg * 100.0) / 100.0);
    }
}