import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x  % 2 == 0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        sc.close();

    }
}
