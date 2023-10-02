import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        if (N < 0 || N > 100) {
            System.out.println("Out of range");
        } else if (N <= 25) {
            System.out.println("Range [0, 25]");
        } else if (N <= 50) {
            System.out.println("Range [25, 50]");
        } else if (N <= 75) {
            System.out.println("Range [50, 75]");
        } else {
            System.out.println("Range [75, 100]");
        }

        sc.close();

    }
}
