import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceA = scanner.nextDouble();
        int priceB = 150;
        double minSale = (((priceA+priceB) / 100) * 10); // minSale- скидка в 10%
        double sum=priceA+priceB;
        if (sum==priceA+priceB){
            System.out.println(sum-minSale);
            System.out.println("Скидка в 10%= "+minSale);
        }else{
            System.out.println("Цена без скидки");
        }

    }
}


