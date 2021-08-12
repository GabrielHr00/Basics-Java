import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        int maxnum = Integer.MIN_VALUE;
        int minnum = Integer.MAX_VALUE;

        for(int i = 0; i < count; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if(number > maxnum) {maxnum = number;}
            if(number < minnum) {minnum = number;}

        }

        System.out.printf("Max number: %d%n", maxnum);
        System.out.printf("Min number: %d", minnum);
    }
}
