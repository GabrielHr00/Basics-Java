import java.util.Scanner;

public class DayofWeek_01 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if(number == 1) {
            System.out.println("Monday");
        }
        else if(number == 2) {
            System.out.println("Tuesday");
        }
        else if(number == 3) {
            System.out.println("Wednesday");
        }
        else if(number == 4) {
            System.out.println("Thursday");
        }
        else if(number == 5) {
            System.out.println("Friday");
        }
        else if(number == 6) {
            System.out.println("Saturday");
        }
        else if(number == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Error");
        }
    }
}
