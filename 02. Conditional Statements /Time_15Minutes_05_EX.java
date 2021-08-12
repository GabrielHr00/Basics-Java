import java.util.Scanner;

public class Time_15Minutes_05_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int rest;

        if(minutes >= 45) {
            ++hours;
            rest = 60 - minutes;
            minutes = 15 - rest;
            if(minutes < 10) {
                if(hours == 24) {
                    hours = 0;
                }
                System.out.printf("%d:0%d", hours, minutes);
            }
            else {
                if(hours == 24) {hours = 0;}
                System.out.printf("%d:%d", hours, minutes);

            }
        }
        else {
            if(hours == 24) hours = 0;
            minutes += 15;
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
