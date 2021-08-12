import java.util.Scanner;

public class Coins_05_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        double rest = Double.parseDouble(scan.nextLine());

        int res = (int)(rest*100);
        while(res > 0) {
            if(res >= 200) {
                res-=200;
                ++counter;
                if(res >= 200) continue;
            }
            if(res >= 100) {
                res-=100;
                ++counter;
                if(res >= 100) continue;
            }
            if(res >= 50) {
                res-=50;
                ++counter;
                if(res >= 50) continue;
            }
            if(res >= 20) {
                res-=20;
                ++counter;
                if(res >= 20) continue;
            }
            if(res >= 10) {
                res-=10;
                ++counter;
                if(res >= 10) continue;
            }
            if(res >= 5) {
                res-=5;
                ++counter;
                if(res >= 5) continue;
            }
            if(res >= 2) {
                res-=2;
                ++counter;
                if(res >= 2) continue;
            }
            if(res >= 1) {
                res-=1;
                ++counter;
                if(res >= 1) continue;
            }

        }

        System.out.println(counter);
    }
}
