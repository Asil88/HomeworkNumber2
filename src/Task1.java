import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double priceA= scanner.nextDouble();
        int priceB=150;
        double minSale = ((priceA/100)*5); // minSale- скидка в 5%

        System.out.println(((priceA*10)-(10*3*minSale))+2*priceB);//  Скидка на товар A 15%
        System.out.println(((priceA*7)-(7*10*minSale))+1*priceB);//  Скидка на товар А 50%
        System.out.println(((priceA*2)-(2*2*minSale))+3*priceB);//  Скидка на товар А 10%
    }
}
