import java.util.Locale;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double triangleArea = A * C / 2.0;
        System.out.printf("TRIANGLE: %.3f%n", triangleArea);

        double pi = 3.14159;
        double circleArea = pi * Math.pow(C, 2);
        System.out.printf("CIRCLE: %.3f%n", circleArea);

        double trapezeArea = (A + B) * C / 2.0;
        System.out.printf("TRAPEZE: %.3f%n", trapezeArea);

        double squareArea = Math.pow(B, 2);
        System.out.printf("SQUARE: %.3f%n", squareArea);

        double rectangleArea = A * B;
        System.out.printf("RECTANGLE: %.3f%n", rectangleArea);

        sc.close();

    }
}
