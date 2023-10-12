package application;

import java.util.Locale;
import java.util.Scanner;

/*Make a program to read the name, age and height of N people, as shown in the example. Then show the
screen the average height of people, and also show the percentage of people under 16, as well as the
names of these people, if any. */

public class ex03 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many persons will be entered? ");
        int N = sc.nextInt();

        String [] name = new String[N];
        int [] age = new int[N];
        double [] height = new double[N];

        for (int i=0; i<N; i++) {
            System.out.printf("Person %d data: %n", i + 1);
            System.out.print("Name: ");
            name[i] = sc.next();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        int nSmallest = 0;
        double totalHeight = 0;
        for (int i=0; i<N; i++) {
            if (age[i] < 16) {
                nSmallest++;
            }
            totalHeight += height[i];
        }

        double avgHeight = totalHeight / N;
        double percentageMinors = ((double) nSmallest / N) * 100.0;

        System.out.printf("\nAverage height = %.2f%n", avgHeight);
        System.out.printf("People under 16: %.1f%%\n", percentageMinors);

        for (int i=0; i<N; i++) {
            if(age[i] < 16) {
                System.out.printf("%s %n", name[i]);
            }
        }
        sc.close();

    }
}
