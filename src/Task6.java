import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        if (n >= 100 && n <= 999) {
            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            System.out.println(sum);
        } else {
            System.out.println("Введенное число не трехзнчное");

        }
    }
}