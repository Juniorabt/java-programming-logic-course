import java.util.Locale;
import java.util.Scanner;

public class cumulativeOperators {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();

        double bill = 50.0;
        if(min > 100) {
            bill += (min - 100) * 2.0;
        }

        System.out.printf("Bill  = R$ %.2f%n", bill);

        sc.close();

    }
}
