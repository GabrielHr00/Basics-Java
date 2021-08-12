import java.util.Scanner;

public class WorldSwimmingRecord_07_EX {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double meters = Double.parseDouble(scan.nextLine());
        double timeInS = Double.parseDouble(scan.nextLine());

        double timeTotal = meters*timeInS;
        double slower = Math.floor(meters/15);
        double secondsSl = slower*12.5;

        double hisTime = timeTotal + secondsSl;

        if(record > hisTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", hisTime);
        }
        else {
            double time = hisTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", time);
        }

    }
}
