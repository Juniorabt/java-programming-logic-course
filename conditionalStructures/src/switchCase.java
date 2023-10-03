import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch (x) {
        case 1:
            dia = "sunday";
            break;
        case 2:
            dia = "monday";
            break;
        case 3:
            dia = "tuesday";
            break;
        case 4:
            dia = "wednesday";
            break;
        case 5:
            dia = "thursday";
            break;
        case 6:
            dia = "friday";
            break;
        case 7:
            dia = "saturday";
            break;
        default:
            dia = "invalid";
            break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();

    }
}
