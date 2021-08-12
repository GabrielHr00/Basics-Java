import java.util.Scanner;

public class SummerOutfit_02_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int grad = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();

        String outfit = "";
        String shoes = "";

        if(time.equals("Morning")) {
            if(grad >= 10 && grad <= 18) {outfit = "Sweatshirt"; shoes = "Sneakers";}
            else if(grad >18 && grad <= 24) {outfit = "Shirt"; shoes = "Moccasins";}
            else {outfit = "T-Shirt"; shoes = "Sandals";}
        }
        else if(time.equals("Afternoon")) {
            if(grad >= 10 && grad <= 18) {outfit = "Shirt"; shoes = "Moccasins";}
            else if(grad >18 && grad <= 24) {outfit = "T-Shirt"; shoes = "Sandals";}
            else {outfit = "Swim Suit"; shoes = "Barefoot";}
        }
        else if(time.equals("Evening")) {
            if(grad >= 10 && grad <= 18) {outfit = "Shirt"; shoes = "Moccasins";}
            else if(grad >18 && grad <= 24) {outfit = "Shirt"; shoes = "Moccasins";}
            else {outfit = "Shirt"; shoes = "Moccasins";}
        }

        System.out.printf("It's %d degrees, get your %s and %s.", grad, outfit, shoes);

    }
}
