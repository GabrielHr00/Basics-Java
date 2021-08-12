import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double qMeters = scan.nextDouble();
        double a = 7.61*qMeters;

        System.out.printf("The final price is: " + (a-(0.18*a)) + " lv.");
        System.out.println("The discount is: " + (0.18*a) + " lv.");
    }
}
