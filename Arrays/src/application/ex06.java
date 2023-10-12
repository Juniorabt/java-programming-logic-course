package application;

import java.util.Scanner;

/*Write a program to read two vectors A and B, containing N elements each. Then generate a third
vector C where each element of C is the sum of the corresponding elements of A and B. Print the
generated vector C. */

public class ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int N = sc.nextInt();

        int [] A = new int[N];
        int [] B = new int[N];
        int [] C = new int[N];

        System.out.println("Enter the values of vector A: ");

        for(int i=0; i<A.length; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the values of vector B: ");

        for(int i=0; i<B.length; i++) {
            B[i] = sc.nextInt();
        }
        for(int i=0; i<C.length; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("RESULTING VECTOR: ");

        for (int i=0; i<N; i++) {
            System.out.printf("%d\n", C[i]);
        }

        sc.close();
        
    }
}
