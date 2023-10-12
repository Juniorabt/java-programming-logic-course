package application;

import java.util.Locale;
import java.util.Scanner;

/*Write a program that reads N real numbers and stores them in a vector. Right away:
- Print all vector elements
- Show the sum and average of the vector elements on the screen */

public class ex02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double [] vect = new double[N];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i];
        }

        double avg = sum / vect.length;

        System.out.println("VALUES = ");

        for (int i=0; i<vect.length; i++) {
            System.out.printf("%.1f%n", vect[i]);
        }

        System.out.printf("\nSUM = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", avg);

        sc.close();

    }
}
