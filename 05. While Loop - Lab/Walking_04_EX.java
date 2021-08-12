import java.util.Scanner;

public class Walking_04_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        String walk = null;
        int steps = 0;


        while(steps < 10000 && !"Going home".equals(walk = scan.nextLine())) {
            steps += Integer.parseInt(walk);
        }

        if(walk.equals("Going home")) {
            steps += Integer.parseInt(scan.nextLine());
        }

        if(steps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", steps - 10000);
        }
        else if(steps < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - steps);
        }
    }
}
