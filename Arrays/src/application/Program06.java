package application;

import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //Matrix instantiation
        int [][] MX = new int [N][N];   

        //Matrix reading
        for (int i=0; i<MX.length; i++) {
            for (int j=0; j<N; j++) {
                MX [i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal = ");
        for (int i=0; i<MX.length; i++) {
            System.out.print(MX[i][i] + " ");
        }
        
        System.out.println();

        int count = 0;
        for (int i=0; i<MX.length; i++) {
            for (int j = 0; j<N; j++) {
                if (MX[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Negative numbers: " + count);

        sc.close();

    }
}