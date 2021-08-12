import java.util.Scanner;

public class Vacation_03_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        double trip = Double.parseDouble(scan.nextLine());
        double hasMoney = Double.parseDouble(scan.nextLine());
        int spend = 0;
        int days = 0;

        while(hasMoney < trip && spend < 5) {
            String sp = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            days++;
            if(sp.equals("spend")) {
                hasMoney -= money;
                ++spend;
                if(hasMoney < 0) {hasMoney = 0;}
            }
            else if(sp.equals("save")){hasMoney += money;spend = 0;}
        }

        if(spend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
        if(hasMoney >= trip) {
            System.out.printf("You saved the money for %d days.",days);
        }

    }
}
