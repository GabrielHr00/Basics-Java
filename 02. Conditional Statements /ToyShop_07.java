import java.util.Scanner;

public class ToyShop_07 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scan.nextLine());
        double puzzle = Double.parseDouble(scan.nextLine());
        double dolls = Double.parseDouble(scan.nextLine());
        double bears = Double.parseDouble(scan.nextLine());
        double minions = Double.parseDouble(scan.nextLine());
        double tir = Double.parseDouble(scan.nextLine());

        double sum = puzzle*2.6 + dolls*3.0 + bears*4.1 + minions*8.2 + tir*2.0;
        double count = puzzle + dolls + bears + minions + tir;


        if(count >= 50) {
            sum = sum - sum*0.25;
        }

        double sumWithRent = sum - sum*0.1;

        if(sumWithRent >= tripPrice) {
            double left = sumWithRent - tripPrice;
            System.out.printf("Yes! %.2f lv left.", left);
        }
        else {
            double needed = tripPrice - sumWithRent;
            System.out.printf("Not enough money! %.2f lv needed.", needed);
        }
    }
}
