package application;

import java.util.Locale;
import java.util.Scanner;

/*Write a program that reads N real numbers and stores them in a vector. Then show on screen the biggest 
number in the vector (assuming there are no ties). Also show the position of the biggest element, considering 
the first position as 0 (zero). */

public class ex05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many nummber will you enter? ");
        int N = sc.nextInt();
        double [] vect = new double[N];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        double biggest = vect[0];
        int bigPos = 0;

        for(int i=0; i<vect.length; i++) {
            if(vect[i] > biggest) {
                biggest = vect[i];
                bigPos = i;
            }
        }

        System.out.println();
        System.out.printf("BIGGEST VALUE = %.1f%n", biggest);
        System.out.println("BIGGEST VALUE POSITION = " + bigPos);

        sc.close();

    }
}
