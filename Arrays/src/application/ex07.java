package application;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the vector have? ");
        int N = sc.nextInt();

        double [] vect = new double [N];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i];
        }

        double avg = sum / vect.length;

        System.out.printf("\nVECTOR AVERAGE = %.3f%n", avg);
        System.out.println("ELEMENTS BELOW AVERAGE: ");

        for (int i=0; i<vect.length; i++) {
            if (vect[i] < avg) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }

        sc.close();

    }
}
