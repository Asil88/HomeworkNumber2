import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double q = scanner.nextInt();
        double w = scanner.nextInt();
        if (q <= 0 || w <= 0) {
            System.out.println("Введенное чило не натуральное");
        } else {
            System.out.println(q / w);
        }
    }
}