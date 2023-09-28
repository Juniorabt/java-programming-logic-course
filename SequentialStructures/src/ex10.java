import java.util.Locale;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1, code2, quantity1, quantity2;
        double price1, price2, total;

        code1 = sc.nextInt();
        quantity1 = sc.nextInt();
        price1 = sc.nextDouble();
        
        code2 = sc.nextInt();
        quantity2 = sc.nextInt();
        price2 = sc.nextDouble();

        total = ((int)quantity1 * price1) + ((int)quantity2 * price2);

        System.out.printf("TOTAL: U$ %.2f%n", total);

        sc.close();

    }
}
