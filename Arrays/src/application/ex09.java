package application;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many persons will be entered? ");
        int N = sc.nextInt();
        String [] name = new String[N];
        int [] age = new int [N];

        for (int i=0; i<N; i++) {
            System.out.printf("Person %d data: %n", i + 1);
            System.out.print("Name: ");
            name[i] = sc.next();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
        }

        int olderAge = age[0];
        int oldPos = 0;

        for (int i=1; i<N; i++) {
            if (age[i] > olderAge) {
                olderAge = age[i];
                oldPos = i;
            }
        }

        System.out.println("OLDER PERSON: " + name[oldPos]);

        sc.close();

    }
}
