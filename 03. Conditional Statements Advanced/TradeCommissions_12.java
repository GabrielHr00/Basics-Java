import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double comis = Double.parseDouble(scan.nextLine());
        double price = 0.0;

        if(city.equals("Sofia")){
            if(comis >= 0 && comis <= 500) {price = comis*0.05; System.out.printf("%.2f",price);}
            else if(comis > 500 && comis <= 1000) {price = comis*0.07; System.out.printf("%.2f",price);}
            else if(comis > 1000 && comis <= 10000) {price = comis*0.08; System.out.printf("%.2f",price);}
            else if(comis > 10000) {price = comis*0.12; System.out.printf("%.2f",price);}
            else System.out.println("error");
        }
        else if(city.equals("Varna")){
            if(comis >= 0 && comis <= 500) {price = comis*0.045; System.out.printf("%.2f",price);}
            else if(comis > 500 && comis <= 1000) {price = comis*0.075; System.out.printf("%.2f",price);}
            else if(comis > 1000 && comis <= 10000) {price = comis*0.1; System.out.printf("%.2f",price);}
            else if(comis > 10000) {price = comis*0.13; System.out.printf("%.2f",price);}
            else System.out.println("error");
        }
        else if(city.equals("Plovdiv")){
            if(comis >= 0 && comis <= 500) {price = comis*0.055; System.out.printf("%.2f",price);}
            else if(comis > 500 && comis <= 1000) {price = comis*0.08; System.out.printf("%.2f",price);}
            else if(comis > 1000 && comis <= 10000) {price = comis*0.12; System.out.printf("%.2f",price);}
            else if(comis > 10000) {price = comis*0.145; System.out.printf("%.2f",price);}
            else System.out.println("error");
        }
        else System.out.println("error");
    }
}
