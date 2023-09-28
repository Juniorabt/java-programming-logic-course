import java.util.Locale;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int workedHours = sc.nextInt();
        double hourValue = sc.nextDouble();

        double salary = hourValue * workedHours;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n", salary);
        
        sc.close();

    }
}
