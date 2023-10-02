import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        if(X >= 0){
            System.out.println("NOT NEGATIVE");
        } else {
            System.out.println("NEGATIVE");
        }

        sc.close();

    }
}