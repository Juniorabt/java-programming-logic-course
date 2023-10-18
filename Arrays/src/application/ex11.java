package application;

import java.util.Locale;
import java.util.Scanner;

/*We have a data set containing the height and gender (M, F) of N people. Make a program calculate and write
 down the group's tallest and shortest heights, the average height of the women, and the number of men. */

public class ex11 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.print("How many persons will be entered? ");
        int N = sc.nextInt();

        double [] height = new double[N];
        char [] gender = new char[N];

        for(int i=0; i<N; i++) {
            System.out.printf("Height of person %d: ", i + 1);
            height[i] = sc.nextDouble();
            System.out.printf("Gender of the person %d: ", i + 1);
            gender[i] = sc.next().charAt(0);
        }

        double smallest = height[0];
        double tallest = height[0];
        for (int i=1; i<N; i++) {
            if (height[i] > tallest) {
                tallest = height[i];
            }
            if (height[i] < smallest) {
                smallest = height[i];
            }
        }

        int qtyM = 0;
        int qtyF = 0;
        double totalHeightF = 0.0;
        for (int i=0; i<gender.length; i++) {
            if (gender[i] == 'M') {
                qtyM++;
            } else {
                qtyF++;
                totalHeightF += height[i];
            }
        }

        double avgHeight = totalHeightF / qtyF;
        System.out.printf("Smallest height = %.2f%n", smallest);
        System.out.printf("Tallest height = %.2f%n", tallest);
        System.out.printf("Women height average = %.2f%n", avgHeight);
        System.out.println("Number of men = " + qtyM);

        sc.close();

    }
}
