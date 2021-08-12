import java.util.Scanner;

public class CinemaTicket_08 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();

        if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")) {
            System.out.println(12);
        }
        else if(day.equals("Wednesday") || day.equals("Thursday")) {
            System.out.println(14);
        }
        else {System.out.println(16);}
    }
}
