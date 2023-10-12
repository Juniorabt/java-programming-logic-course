package application;

import java.util.Locale;
import java.util.Scanner;

/* Make a program to read a vector of N integers. Then show the average on the screen
arithmetic only of even numbers read, with one decimal place. If no even number is
entered, show the message "NO EVEN NUMBER" */

public class ex08 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        int N, evenSum = 0, nEven = 0;
        double evenAvg;

        System.out.print("How many elements will the vector have? ");
        N = sc.nextInt();
        int [] vect = new int[N];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        for (int i=0; i<vect.length; i++) {
            if (vect[i] % 2 == 0) {
                evenSum += vect[i];
                nEven++;
            }
        }

        if (nEven == 0) {
            System.out.println("NO EVEN NUMBER");
        } else {
            evenAvg = (double) evenSum / nEven;

            System.out.printf("EVEN AVERAGE = %.1f%n", evenAvg);
        }

        sc.close();

    }
}
