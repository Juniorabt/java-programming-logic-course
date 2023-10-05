package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RectangleEx01;

public class ex01 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RectangleEx01 rect = new RectangleEx01();
       
        System.out.println("Enter the rectangle Width and Height: ");
        rect.Width = sc.nextDouble();
        rect.Height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.Area());
        System.out.printf("PERIMETER = %.2f%n", rect.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.Diagonal());

        sc.close();

    }
}
