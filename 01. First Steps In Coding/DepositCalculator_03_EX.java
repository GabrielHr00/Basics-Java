import java.util.Scanner;

public class DepositCalculator_03_EX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double depSum = Double.parseDouble(scan.nextLine());
        double months = Double.parseDouble(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double sum = depSum + months*((depSum*(percent/100)/12));

        System.out.printf("%.2f", sum);

    }
}
