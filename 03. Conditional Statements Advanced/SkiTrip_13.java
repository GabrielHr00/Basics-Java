import java.util.Scanner;

public class SkiTrip_13 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String rate = scan.nextLine();
        double price = 0.0;

        if(room.equals("room for one person")) {
            if(days < 10) {price = 18.0;}
            else if(days >= 10 && days <= 15) {price = 18.0;}
            else if(days > 15) {price = 18.0;}
        }
        else if(room.equals("apartment")) {
            if(days < 10) {price = 25.0 - 25.0*0.30;}
            else if(days >= 10 && days <= 15) {price = 25.0 - 25.0*0.35;}
            else if(days > 15) {price = 25.0 - 25.0*0.5;}
        }
        else if(room.equals("president apartment")) {
            if(days < 10) {price = 35.0 - 35.0*0.10;}
            else if(days >= 10 && days <= 15) {price = 35.0 - 35.0*0.15;}
            else if(days > 15) {price = 35.0 - 35.0*0.20;}
        }

        double nights = days -1.0;
        double totalPrice = nights*price;

        if(rate.equals("positive")) {totalPrice = totalPrice + totalPrice*0.25;}
        else if(rate.equals("negative")) {totalPrice = totalPrice - totalPrice*0.10;}


        System.out.printf("%.2f", totalPrice);
    }
}

