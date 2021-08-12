import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        boolean valid = false;

        if(number >= 100 && number <= 200 || number == 0) valid = true;

        if(valid == false) {
            System.out.println("invalid");
        }
    }
}
