import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        int fuel = sc.nextInt();

        while (fuel != 4) {

            if (fuel == 1) {
                alcohol +=  1;
            } else if (fuel == 2) {
                gasoline += 1;
            } else if (fuel == 3) {
                diesel += 1;
            }
            
            fuel = sc.nextInt();

        }

        System.out.println("THANK YOU!");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}
