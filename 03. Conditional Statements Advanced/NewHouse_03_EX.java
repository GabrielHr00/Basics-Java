import java.util.Scanner;

public class NewHouse_03_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int countFl = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        double total = 0.0;

        if(flower.equals("Roses")) {
            price = countFl*5.0;
            if(countFl > 80) {total = price*0.10;price -= total;}

        }
        else if(flower.equals("Dahlias")) {
            price = countFl*3.8;
            if(countFl > 90) {total = price*0.15;price -= total;}

        }
        else if(flower.equals("Tulips")) {
            price = countFl*2.8;
            if(countFl > 80) {total = price*0.15;price -= total;}

        }
        else if(flower.equals("Narcissus")) {
            price = countFl*3.0;
            if(countFl < 120) {total = price*0.15;price += total;}

        }
        else if(flower.equals("Gladiolus")) {
            price = countFl*2.50;
            if(countFl < 80) {total = price*0.20;price += total;}

        }

        if(budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFl, flower, (budget - price));
        }
        else if(budget < price) {
            total = Math.abs(price-budget);
            System.out.printf("Not enough money, you need %.2f leva more.",total );
        }


    }
}
