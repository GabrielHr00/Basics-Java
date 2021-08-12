import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dogs = scan.nextDouble();
        double others = scan.nextDouble();

        System.out.printf(((2.50*dogs)+(4.0*others)) + " lv.");
    }
}
