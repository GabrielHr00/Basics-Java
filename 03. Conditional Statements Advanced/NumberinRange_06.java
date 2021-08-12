import java.util.Scanner;

public class NumberinRange_06 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());

        if(number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");
        }
        else {System.out.println("No");}
    }
}
