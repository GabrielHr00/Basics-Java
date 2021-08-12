import java.util.Scanner;

public class CharityCampaign_06_EX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int pastryShop = Integer.parseInt(scan.nextLine());
        int cakesCount = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double sumForAllBakers = (cakesCount*45 + waffles*5.80 + ((double)pancakes*3.2))*pastryShop;
        double allCompanys = sumForAllBakers*days;
        double afterTheBills = allCompanys - allCompanys/8;

        System.out.printf("%.2f", afterTheBills);

    }
}
