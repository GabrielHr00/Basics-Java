import java.util.Scanner;

public class FishTank_08_EX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int heigth = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double volume = length*width*heigth;
        double volumeInLitres = volume*0.001;
        double realPercent = percent/100;
        double realLitres = volumeInLitres*(1-realPercent);

        System.out.printf("%.2f",realLitres);
    }
}
