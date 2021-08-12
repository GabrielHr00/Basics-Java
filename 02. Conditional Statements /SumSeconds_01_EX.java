import java.util.Scanner;

public class SumSeconds_01_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int firstTime = Integer.parseInt(scan.nextLine());
        int secondTime = Integer.parseInt(scan.nextLine());
        int thirdTime = Integer.parseInt(scan.nextLine());

        int totalTime = firstTime + secondTime + thirdTime;

        int minutes = totalTime/60;
        int seconds = totalTime % 60;

        if(seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
