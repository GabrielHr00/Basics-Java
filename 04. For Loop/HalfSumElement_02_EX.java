import java.util.Scanner;

public class HalfSumElement_02_EX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number > max) {
                max = number;
            }
            sum = sum + number;
        }

        int dif = sum - max;
        int diff = max - dif;

        if (dif == max) {
            System.out.printf("Yes %nSum = %d", max);
        } else {
            System.out.printf("No %nDiff = %d", Math.abs(diff));
        }
    }
}
