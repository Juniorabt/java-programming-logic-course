package application;

import java.util.Scanner;

/*Write a program that reads N integers and stores them in a vector. Then show the
displays all even numbers, and also the number of even numbers. */

public class ex04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int N = sc.nextInt();
        int [] vect = new int[N];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("\nEVEN NUMBERS: ");

        int evenQty = 0;
        for(int i=0; i<vect.length; i++) {
            if(vect[i] % 2 == 0) {
                System.out.printf("%d  ", vect[i]);
                evenQty++;
            }
        }

        System.out.printf("\n\nEVEN QUANTITY: %d\n", evenQty);


        sc.close();

    }
}
