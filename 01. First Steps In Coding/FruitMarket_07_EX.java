import java.util.Scanner;

public class FruitMarket_07_EX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scan.nextLine());
        double banana = Double.parseDouble(scan.nextLine());
        double orange = Double.parseDouble(scan.nextLine());
        double raspberry = Double.parseDouble(scan.nextLine());
        double strawberries = Double.parseDouble(scan.nextLine());

        double raspberriesPrice = strawberriesPrice/2.0;
        double orangePrice = raspberriesPrice - raspberriesPrice*0.4;
        double bananaPrice = raspberriesPrice - raspberriesPrice*0.8;
        double sum = raspberry*raspberriesPrice + orange*orangePrice + banana*bananaPrice + strawberries*strawberriesPrice;

        System.out.printf("%.2f",sum);
    }
}
