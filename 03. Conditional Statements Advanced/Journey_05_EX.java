import java.util.Scanner;

public class Journey_05_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination = "";
        String place = "";
        Double price = 0.0;

        if(budget <= 100) {
            destination = "Bulgaria";
            if(season.equals("summer")) {
                place = "Camp";
                price = budget*0.3;
            }
            else if(season.equals("winter")) {
                place = "Hotel";
                price = budget*0.7;
            }
        }
        else if(budget <= 1000) {
            destination = "Balkans";
            if(season.equals("summer")) {
                place = "Camp";
                price = budget*0.4;
            }
            else if(season.equals("winter")) {
                place = "Hotel";
                price = budget*0.8;
            }
        }
        else if(budget > 1000) {
            destination = "Europe";
            place = "Hotel";
            price = budget*0.9;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, price);

    }
}
