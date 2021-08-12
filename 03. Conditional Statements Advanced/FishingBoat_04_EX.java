import java.util.Scanner;

public class FishingBoat_04_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishers = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        if(season.equals("Spring")) {
            price = 3000.0;
            if(fishers <= 6) {price = price - price*0.10;}
            else if(fishers <= 11) {price = price - price*0.15;}
            else if(fishers > 12) {price = price - price*0.25;}

        }
        else if(season.equals("Summer")) {
            price = 4200.0;
            if(fishers <= 6) {price = price - price*0.10;}
            else if(fishers <= 11) {price = price - price*0.15;}
            else if(fishers > 12) {price = price - price*0.25;}

        }
        else if(season.equals("Autumn")) {
            price = 4200.0;
            if(fishers <= 6) {price = price - price*0.10;}
            else if(fishers <= 11) {price = price - price*0.15;}
            else if(fishers > 12) {price = price - price*0.25;}

        }
        else if(season.equals("Winter")) {
            price = 2600.0;
            if(fishers <= 6) {price = price - price*0.10;}
            else if(fishers <= 11) {price = price - price*0.15;}
            else if(fishers > 12) {price = price - price*0.25;}

        }

        if(fishers % 2 == 0 && !season.equals("Autumn")){
            price = price - price*0.05;
        }
        double total = 0.0;

        if(budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        }
        else if(budget < price) {
            total  = Math.abs(price - budget);
            System.out.printf("Not enough money! You need %.2f leva.", total);
        }

    }
}
