import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            
            int first = i;
            int second = i * i;
            int third = i * i * i;

            System.out.printf("%d %d %d%n", first, second, third);
        }

        sc.close();

    }
}
