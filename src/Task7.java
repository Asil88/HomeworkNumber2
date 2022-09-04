import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = (scanner.nextDouble());

        if (n%2!=0) {
            System.out.println(Math.round(n));
        }else{
            System.out.println("Числос нулевой дробной частью");
        }

    }
}
