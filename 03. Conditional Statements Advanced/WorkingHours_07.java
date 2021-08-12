import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        double hour = Double.parseDouble(scan.nextLine());
        String day = scan.nextLine();

        if(hour >= 10 && hour <= 18) {
            if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday")) {
                System.out.println("open");
            }
            else {System.out.println("closed");}
        }
        else {System.out.println("closed");}
    }
}
