import java.util.Scanner;

public class EvenPowersof2_04 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int i = 0; i <= n; i+=2) {
            double number = Math.pow(2,i);
            System.out.printf("%.0f%n",number);
        }
    }
}
