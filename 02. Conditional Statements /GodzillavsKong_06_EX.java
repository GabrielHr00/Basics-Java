import java.util.Scanner;

public class GodzillavsKong_06_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int statists = Integer.parseInt(scan.nextLine());
        double pricePerPerson = Double.parseDouble(scan.nextLine());

        double decour = 0.1*budget;
        double sumClothes = statists*pricePerPerson;

        if(statists > 150) {
            sumClothes = sumClothes - sumClothes*0.1;
        }


        double totalSum = decour + sumClothes;

        if(totalSum <= budget) {
            totalSum = budget - totalSum;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", totalSum);
        }
        else {
            totalSum = budget - totalSum;
            totalSum = totalSum*(-1);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSum);
        }

    }
}
