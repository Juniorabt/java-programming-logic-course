package application;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int [][] MX = new int[M][N];

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                MX[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                if (MX[i][j] == x) {
                    System.out.println("Position " + i + ", " + j + ":");

                    if (j > 0) {
                        System.out.println("Left: " + MX[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + MX[i-1][j]);
                    }
                    if (j < MX[i].length-1) {
                        System.out.println("Right: " + MX[i][j+1]);
                    }
                    if (i < MX.length-1) {
                        System.out.println("Down: " + MX[i+1][j]);
                    }
                }
            }
        }
        sc.close();

    }
}
