package application;

import java.util.Locale;
import java.util.Scanner;

/*Make a program to read a set of N student names, as well as the grades they got in the
1st and 2nd semesters. Each of this information must be stored in a vector. Then print
the names of approved students, considering those whose grade average is higher
or higher as approved. equal to 6.0 (six). */

public class ex10 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students will be entered? ");
        int N = sc.nextInt();

        String[] name = new String[N];
        double[] grade1 = new double[N];
        double[] grade2 = new double[N];

        for (int i=0; i<N; i++) {
            System.out.printf("Enter the name, first and second grade of the %dst student: %n", i + 1);
            sc.nextLine();
            name[i] = sc.nextLine();
            grade1[i] = sc.nextDouble();
            grade2[i] = sc.nextDouble();
        }

        System.out.println("Approved students: ");
        
        double avg;
        for (int i=0; i<N; i++) {
            avg = (grade1[i] + grade2[i]) / 2.0;

            if (avg >= 6.0) {
                System.out.printf("%s%n", name[i]);
            }
        }

        sc.close();

    }
}
