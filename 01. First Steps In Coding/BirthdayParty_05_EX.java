import java.util.Scanner;

public class BirthdayParty_05_EX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int rent = Integer.parseInt(scan.nextLine());
        double cake = rent*0.2;
        double beers = cake - cake*0.45;
        double animator = rent/3;

        double sum = rent + cake + beers + animator;

        System.out.printf("%.1f", sum);
    }
}
