import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, y, sum;

        x = sc.nextInt();
        y = sc.nextInt();
        
        sum = x + y;

        System.out.println("SUM = " + sum);

        sc.close();

    }
}