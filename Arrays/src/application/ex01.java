package application;

import java.util.Scanner;

/*Write a program that reads a positive integer N (maximum = 10) and then N integers
and store them in a vector. Then show all the negative numbers read on the screen.*/

public class ex01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] vect = new int[N];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS: ");
        
        for (int i=0; i<vect.length; i++) {
            if (vect[i] < 0){
                System.out.printf("%d\n", vect[i]);
            }
        }

        sc.close();

    }
}
