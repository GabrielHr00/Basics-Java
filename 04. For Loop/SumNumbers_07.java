import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for(int i = 1; i <= count; i++) {
            int number = Integer.parseInt(scan.nextLine());

            sum+= number;

        }
        System.out.println(sum);
    }
}
