import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int startTime = sc.nextInt();
        int endTime = sc.nextInt();

        int duration;
        if (startTime < endTime) {
            duration = endTime - startTime;
        } else {
            duration = 24 - startTime + endTime;
        }

        System.out.println("THE GAME LASTED " + duration + " HOUR(S)");

        sc.close();
        
    }
}
