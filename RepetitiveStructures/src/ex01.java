import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println("Invalid password");
            password = sc.nextInt();
        }

        System.out.println("Access allowed");

        sc.close();

    }
}