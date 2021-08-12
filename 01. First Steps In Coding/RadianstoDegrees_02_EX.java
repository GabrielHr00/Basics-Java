import java.util.Scanner;

public class RadianstoDegrees_02_EX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rad = Double.parseDouble(scan.nextLine());
        double grad = rad*(180/Math.PI);
        System.out.printf("%.0f",grad);
    }
}
