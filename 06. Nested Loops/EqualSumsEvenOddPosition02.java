import java.util.Scanner;

public class EqualSumsEvenOddPosition02 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        for(int i = n; i <= m; i++) {
            int sum1 = 0;
            int sum2 = 0;
            int number = i;
            for(int j = 6; j >= 1; j--) {
                int digit = number%10;
                number = number/10;
                if(j%2 == 0) {
                    sum1 += digit;
                }else {
                    sum2 += digit;
                }
            }
            if(sum1 == sum2) {
                System.out.print(i + " ");
            }
        }
    }
}
